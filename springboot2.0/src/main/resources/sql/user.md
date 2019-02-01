findAll
===
* 注释

	select #use("cols")# from user  where  #use("condition")#

cols
===
	id,name,money

updateSample
===
	
	id=#id#,name=#name#,money=#money#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(name)){
	 and name=#name#
	@}
	@if(!isEmpty(money)){
	 and money=#money#
	@}


