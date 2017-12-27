function $(id) {
	return document.getElementById(id);
}
// 中文、字母、数字、_ - 4-20

var regs = {
	userNameReg: /^(([\u4e00-\u9fa5])|[a-zA-Z0-9-_]){4,20}$/,
	pwdReg: /^.{6,20}$/,
	numReg: /\d/,
	strReg: /[a-zA-Z]/,
	tsReg: /[^\u4e00-\u9fa5a-zA-Z0-9]/
}
window.onload = function() {
	// 用户名字母、数字、_、-、中文  \u4e00-\u9fa5  4-20
	// box   常规 box  出错的时候  box error  正确的时候  box right
	// tip   常规 tip hide  出错的时候  tip error  默认的时候  tip default
	var userName = $("userName");
	var pwd = $("pwd");
	var pwd2 = $("pwd2");
	var email = $("email");
	var mobile = $("mobile");
	var ck = $("ck");
	var btn = $("btn");

	userName.onkeyup=userName.onfocus=userName.onblur=function(evt) {
		var e = evt || window.event;
		checkUserName(e);
	}
	function checkUserName(_e) {
		var type;
		if(_e) {
			type = _e.type;
		}
		var value = userName.value;
		var box = userName.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(type=="focus") {
			if(value=="") {
				box.className = "box";
				tip.className = "tip default";
				span.innerHTML = "need combination of 4-20 characters";
				return false;
			}
		}
		if(type=="blur") {
			if(value=="") {
				box.className = "box";
				tip.className = "tip hide";
				return false;//不继续往下走
			}
		}

		if(value=="") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "The username can not be empty";
			return false;
		} else if(regs.userNameReg.test(value)) {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "Format error, need characters combination";
			return false;
		}
	}
	pwd.onkeyup=pwd.onfocus=pwd.onblur=function(evt) {
		var e = evt || window.event;
		checkPwd(e);
	}
	function checkPwd(_e) {
		var type;
		if(_e) {
			type = _e.type;
		}
		var value = pwd.value;
		var box = pwd.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(type=="focus") {
			if(value=="") {
				box.className = "box";
				tip.className = "tip default";
				span.innerHTML = "se two or more combinations with 6-20 characters";
				return false;
			}
		}
		if(type=="blur") {
			if(value=="") {
				box.className = "box";
				tip.className = "tip hide";
				return false;
			}
		}

		if(value=="") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "The password can not be empty";
			return false;
		} else if(regs.pwdReg.test(value)) {
			box.className = "box right";
			var level = getPwdLevel(value);
			switch(level) {
				case 1:
					tip.className = "tip ruo";
					break;
				case 2:
					tip.className = "tip zhong";
					break;
				case 3:
					tip.className = "tip qiang";
					break;
			}
			return true;
			// 弱  中  强
			// 字母、数字、特殊字符
			// level 1弱 2中  3强
			// tip ruo zhong qiang
			// jkj343?
			// tip.className = ""
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "The password length should be between 6-20 characters";
			return false;
		}
	}
	pwd2.onkeyup=pwd2.onfocus=pwd2.onblur=function(evt) {
		var e = evt || window.event;
		checkPwd2(e);
	}
	function checkPwd2(_e) {
		var type;
		if(_e) {
			type = _e.type;
		}
		var value1 = pwd.value;
		var value = pwd2.value;
		var box = pwd2.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(type=="focus") {
			if(value=="") {
				box.className = "box";
				tip.className = "tip default";
				span.innerHTML = "Please enter the password again";
				return false;
			}
		}
		if(value == "") {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "Please enter the password again";
			return false;
		} else if(value1 == value) {
			box.className = "box right";
			tip.className = "tip hide";
			return true;
		} else {
			box.className = "box error";
			tip.className = "tip error";
			span.innerHTML = "Two cipher inconsistencies";
			return false;
		}
	}
	btn.onclick = function() {
		var box = ck.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(ck.checked) {
			if(checkUserName()&&checkPwd()&&checkPwd2()) {
				alert("Can be registered");
			} else {
				return false;
			}
		} else {
			tip.className = "tip error";
			span.innerHTML = "Please agree with the agreement";
			return false;
		}
	}
	ck.onclick = function() {
		var box = ck.parentNode;
		var tip = box.nextElementSibling;
		var span = tip.lastElementChild;
		if(ck.checked) {
			tip.className = "tip hide";
		}
	}
}
function getPwdLevel(pwd) {
	var level = 0;
	var numReg=true, strReg=true, tsReg=true;
	for(var i=0; i<pwd.length; i++) {
		if(numReg&&regs.numReg.test(pwd[i])) {
			level++;
			numReg = false;
			continue;
		}
		if(strReg&&regs.strReg.test(pwd[i])) {
			level++;
			strReg = false;
			continue;
		}
		if(tsReg&&regs.tsReg.test(pwd[i])) {
			level++;
			tsReg = false;
		}
	}
	return level;
}