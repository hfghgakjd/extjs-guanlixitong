/*******************************************************************************
 * 自定义一个Panel类继承Ext.Panel
 ******************************************************************************/
Ext.define('Demo.view.CenterPanel', {
	extend : 'Ext.tab.Panel',
	initComponent : function() {
		var me = this;
		Ext.apply(this, {
			region : "center",
			title : '主题内容',
			split : true,
			border : true,
			collapsible : true,
			items:[{
				title:'首页',
				html:'欢迎使用OA办公系统'
			}]
		});
		me.callParent(arguments);
	}
});