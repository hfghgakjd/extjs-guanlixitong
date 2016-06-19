Ext.define("Demo.store.AccordionStore", {
	extend : 'Ext.data.Store',
	requires : [ "Demo.model.Accordion" ],
	model : 'Demo.model.Accordion',
	autoLoad : true,
	proxy : {
		extend : 'Ext.data.proxy.Ajax',
		type : 'ajax',
		actionMethods : {
			create : 'POST',
			read : 'POST',
			update : 'POST',
			destroy : 'POST'
		},
		url : 'menu/accordion.do',
		reader : {
			type : 'json',
			root : 'data'
		}
	}
});