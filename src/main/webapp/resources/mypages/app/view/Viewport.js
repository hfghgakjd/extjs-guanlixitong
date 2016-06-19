Ext.define('Demo.view.Viewport', {
	extend : 'Ext.container.Viewport',
	layout : 'border',
	requires : [ 'Demo.view.TopPanel', 'Demo.view.WestPanel',
			'Demo.view.CenterPanel' ],
	initComponent : function() {
		Ext.apply(this, {
			layout : "border",
			defaults : {
				bodyStyle : "background-color: #FFFFFF;",
				frame : true
			},
			items : [ Ext.create('Demo.view.TopPanel'),
					Ext.create('Demo.view.WestPanel'),
					Ext.create('Demo.view.CenterPanel') ]
		});
		this.callParent(arguments);
	}
});