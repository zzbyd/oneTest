var obj = $.extend({},{
	init:function(){
		this.bindEvent();
	},
	bindEvent:function(){
		$('#btn').on('click',this.tests)
	},
	tests:function(){
		window.alert('123456');
	}
});
obj.init();