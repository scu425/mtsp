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
    <script type="text/javascript" src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- Bootstrap -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <style>
.topbg { background:url(../../images/topbg.gif) repeat-x; height:80px;}
.toplink a { color:#FFFFFF; text-decoration:none;}
.toplink a:hover { color:#FFFFFF; text-decoration:underline;}
.toplink img { vertical-align:bottom;}
.topnavbg { background:url(../../images/StatBarBg.gif) repeat-x;}
.topnavlh { height:30px; line-height:30px; font-size:12px;}
.topnavlh img { vertical-align:middle;}
    </style>
</head>
<script>

</script>
<body>
<table width="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td width="320" height="80" class="topbg"><img src="../../images/logo.png" width="320" height="80"></td>
    <td class="topbg">
      <table width="100%" border="0" cellpadding="0" cellspacing="0">
        <tr>
          <td height="50" class="toplink" align="right"><img src="../../images/top_home.gif">&nbsp;&nbsp;<a href="">网站首页</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img src="../../images/top_exit.gif">&nbsp;&nbsp;<a href="/logout" id="exit"  target="_parent">注销退出</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
        </tr>
        <tr>
          <td height="30" class="topnavbg">
            <table width="100%" border="0" cellpadding="0" cellspacing="0">
              <tr>
                <td width="60"><img src="../../images/StatBarL.gif" width="60" height="30"></td>
                <td class="topnavlh" align="left"><img src="../../images/StatBar_admin.gif">&nbsp;&nbsp;当前用户：【${sessionScope.manager_session.name}】</td>
                <td class="topnavlh" align="right"><img src="../../images/StatBar_time.gif">&nbsp;&nbsp;<span id="nowTime"></span>
                
             </td>
                <td width="3%"></td>
              </tr>
            </table>
          </td>
        </tr>
      </table>
    </td>
  </tr>
</table>
</body>
</html>

