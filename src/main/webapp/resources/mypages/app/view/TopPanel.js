/*******************************************************************************
 * 自定义一个Panel类继承Ext.Panel
 ******************************************************************************/
Ext.define('Demo.view.TopPanel', {
	extend : 'Ext.Panel',
	initComponent : function() {
		var me = this;
		Ext.apply(this, {
			region : "north",
			height : 100,
			title : 'Extjs案例',
			border:true,
			split:true,
			collapsible : true,
			html:"extjs案例分析"
		});
		me.callParent(arguments);
	}
});