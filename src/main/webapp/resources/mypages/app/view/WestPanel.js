/*******************************************************************************
 * 自定义一个Panel类继承Ext.Panel
 ******************************************************************************/
Ext.require('Ext.panel.Panel');
/**
 * 添加accordion panel 的方法
 */
var accordion = {
	extend:'Ext.panel.Panel',
	title : '功能菜单',
	layout : 'accordion',
	region : 'west',
	width : 170,
	border : true,
	split : true,
	collapsible : true
}
var addAccordion = function() {
	var store = Ext.create("Demo.store.AccordionStore");
	store.load({
		callback : function(records, operation, success) {
			Ext.each(records, function(record) {
				console.log(accordion);
				accordion.add({
					title : record.get("title"),
					id : record.get("ID"),
					html : record.get("html")
				});
			});
		}
	});
}
addAccordion();
Ext.define('Demo.view.WestPanel', {
	extend : 'Ext.panel.Panel',
	requires : [ "Demo.store.AccordionStore" ],
	initComponent : function() {
		var me = this;
		Ext.apply(this,{
			width:170,
			region:'west',
			
	collapsible : true,

			
			items:[accordion]
		});
		me.callParent(arguments);
	}
});