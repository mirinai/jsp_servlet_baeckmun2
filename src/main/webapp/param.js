/**
 * 
 */

function check() {
	if (!document.frm.id.value) {
		alert("아이디를 입력해라");
		document.frm.id.focus();
		return false;
	}
	else if (document.frm.age.value == "") {
		alert("나이을 입력해라");
		document.frm.age.focus();
		return false;
	}
	else if (isNaN(document.frm.age.value)) {
		alert("숫자를 입력해라");
		document.frm.age.focus();
		return false;
	}
	else{
		return true;
	}
}