<%--
  Created by IntelliJ IDEA.
  User: zhc
  Date: 2017/12/27
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Math Talent Search Programs</title>
    <meta name="keywords" content="Math,Talent,Search,Programs" />
    <meta name="description" content="Math Talent Search Programs">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="shortcut icon" href="../../images/favicon.ico" />
    <link rel='stylesheet prefetch' href='../../register/css/reset.css'>
    <link rel="stylesheet" type="text/css" href="../../register/css/default.css">
    <link rel="stylesheet" type="text/css" href="../../register/css/styles.css">

</head>
<body>
<header class="htmleaf-header">

    <div class="htmleaf-links">
        <a class="htmleaf-icon icon-htmleaf-home-outline" href="index.html" title="index" target="_blank"><span> index</span></a>
        <a class="htmleaf-icon icon-htmleaf-arrow-forward-outline" href="login.html" title="login" target="_blank"><span> return login</span></a>
    </div>
</header>
<article class="htmleaf-content">
    <!-- multistep form -->
    <form id="msform" action="/user/register">
        <!-- progressbar -->
        <ul id="progressbar" >
            <li class="active">Account Settings</li>
            <li>Personal details</li>
        </ul>
        <!-- fieldsets -->
        <fieldset>
            <h2 class="fs-title">Create your account</h2>
            <h3 class="fs-subtitle">This is the first step</h3>
            <input type="text" name="flag" value="1" hidden="hidden">
            <input type="text" name="email" placeholder="email " />
            <input type="text" name="loginname" placeholder="loginname " />
            <input type="password" name="password" placeholder="password" />
            <input type="password" name="cpassword" placeholder="repeat" />
            <input type="button" name="next" class="next action-button" value="Next" />
        </fieldset>

        <fieldset>
            <h2 class="fs-title">Personal details</h2>
            <h3 class="fs-subtitle">Personal details are confidential and will not be leaked</h3>
            <input type="text" name="username" placeholder="realname" />
            <input type="text" name="gender" placeholder="gender" />
            <input type="text" name="school" placeholder="school" />
            <input type="text" name="grade" placeholder="grade" />
            <input type="text" name="age" placeholder="age" />
            <input type="button" name="previous" class="previous action-button" value="Previous" />
            <input type="submit" name="submit" class="submit action-button" value="Submit" />
        </fieldset>
    </form>
</article>

<script src="../../register/js/jquery-2.1.1.min.js"></script>
<script src="../../register/js/jquery.easing.min.js" type="text/javascript"></script>
<script>
    var current_fs, next_fs, previous_fs;
    var left, opacity, scale;
    var animating;
    $('.next').click(function () {
        if (animating)
            return false;
        animating = true;
        current_fs = $(this).parent();
        next_fs = $(this).parent().next();
        $('#progressbar li').eq($('fieldset').index(next_fs)).addClass('active');
        next_fs.show();
        current_fs.animate({ opacity: 0 }, {
            step: function (now, mx) {
                scale = 1 - (1 - now) * 0.2;
                left = now * 50 + '%';
                opacity = 1 - now;
                current_fs.css({ 'transform': 'scale(' + scale + ')' });
                next_fs.css({
                    'left': left,
                    'opacity': opacity
                });
            },
            duration: 800,
            complete: function () {
                current_fs.hide();
                animating = false;
            },
            easing: 'easeInOutBack'
        });
    });
    $('.previous').click(function () {
        if (animating)
            return false;
        animating = true;
        current_fs = $(this).parent();
        previous_fs = $(this).parent().prev();
        $('#progressbar li').eq($('fieldset').index(current_fs)).removeClass('active');
        previous_fs.show();
        current_fs.animate({ opacity: 0 }, {
            step: function (now, mx) {
                scale = 0.8 + (1 - now) * 0.2;
                left = (1 - now) * 50 + '%';
                opacity = 1 - now;
                current_fs.css({ 'left': left });
                previous_fs.css({
                    'transform': 'scale(' + scale + ')',
                    'opacity': opacity
                });
            },
            duration: 800,
            complete: function () {
                current_fs.hide();
                animating = false;
            },
            easing: 'easeInOutBack'
        });
    });
    /*$('.submit').click(function () {
        return false;
    });*/
</script>
</body>
</html>