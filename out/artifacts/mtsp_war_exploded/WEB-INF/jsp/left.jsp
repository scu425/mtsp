<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Math Talent Search Programs</title>
    <meta name="keywords" content="Math,Talent,Search,Programs" />
    <meta name="description" content="Math Talent Search Programs">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="../../images/favicon.ico" />
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <script language="javascript" type="text/javascript"> 
            $(function(){
                /** 给左侧功能菜单绑定点击事件  */
                //匹配id以navbg开头的td标签
                $("td[id^='navbg']").click(function(){
                     /** 获取一级菜单的id */
                     var navbgId = this.id;
                     /** 获取对应的二级菜单id */
                     var submenuId = navbgId.replace('navbg','submenu');
                     /** 控制二级菜单显示或隐藏  */
                     $("#"+submenuId).toggle();//切换事件使隐藏或显示
                     $("#"+navbgId+" span").toggleClass("glyphicon-chevron-down");
                     /** 控制其他的一级菜单的二级菜单隐藏按钮都关闭  */
                     $("tr[id^='submenu']").not("#"+submenuId).hide();
            
                     
                })
            })
        </script>
        <style>
.table { width: 200px;
    height: 100%;
}
        </style>
</head>
<body style="background-color: #e5f0ff">
	<div style="background-color:#FFFFFF;margin: 10px; text-align:left;">
<table class="table table-bordered" >
<tr><td class="left_nav_top"><div class="font1"><span class="glyphicon glyphicon-user">&nbsp;</span>用户管理</div></td></tr>
<tr><td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="user/selectUser?pageNum=1" target="main">用户查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="user/addUser?flag=1" target="main">添加用户</a></p>
</td>
</tr>
<tr><td id="navbg1"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>试题管理</div></td></tr>
<tr id="submenu1" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="exam/selectExam" target="main">试题查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="exam/addExam?flag=1" target="main">添加试题</a></p>
</td>
</tr>
<tr><td id="navbg2"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>学生答题管理</div></td></tr>
<tr id="submenu2" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="answerDetailStu/selectAnswerDetailStu" target="main">学生答题查询</a></p>
</td></tr>
<tr ><td id="navbg3"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>介绍管理</div></td></tr>
<tr id="submenu3" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="about/selectAbout" target="main">介绍查询</a></p>
</td></tr>
<tr><td id="navbg4"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>主办人管理</div></td></tr>
<tr id="submenu4" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="people/selectPeople" target="main">主办人查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="people/addPeople?flag=1" target="main">添加主办人</a></p>
</td>
</tr>
<tr><td id="navbg5"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>捐助管理</div></td></tr>
<tr id="submenu5" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="donate/selectDonate" target="main">捐助查询</a></p>
</td>
</tr>
<tr><td id="navbg6"><div class="font1"><span class="glyphicon glyphicon-chevron-right">&nbsp;</span>管理员管理</div></td></tr>
<tr id="submenu6" style="display: none">
<td>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="mymanager/selectManager" target="main">管理员查询</a></p>
<p><span class="glyphicon glyphicon-menu-right"></span><a href="mymanager/addManager?flag=1" target="main">添加管理员</a></p>
</td></tr>
</table>
</div>
</body>
</html>