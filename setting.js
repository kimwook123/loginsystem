let myname="홍길동"
let myproject="스프링 WAS 활용한 로그인 시스템"

$(()=>{
	$("#maintitle").text(`${myproject} [${myname}]`)
	$("title").text(`${myproject} [${myname}]`)
})
