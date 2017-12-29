package scu.mtsp.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import scu.mtsp.domain.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static scu.mtsp.constant.MTSPConstant.USER_SESSION;

/**
 * Created by zhc on 2017/12/26
 */
public class AuthorizedInterceptor implements HandlerInterceptor{
    private static final String[] IGNORE_URI = {"/login","/register"};
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        boolean flag = false;
        /*获得servlet的路径*/
        String path = request.getServletPath();
        for (String s : IGNORE_URI){
            if (path.contains(s)){
                flag =true;
                break;
            }
        }
        if (!flag){
            User user =(User) request.getSession().getAttribute(USER_SESSION);
            //判断用户是否登陆
            if (user == null){
                request.setAttribute("message","您因为用户未登陆，请先登陆");
                request.getRequestDispatcher("/login").forward(request,response);
                return flag;
            }else {
                flag = true;
            }
        }
        return flag;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
