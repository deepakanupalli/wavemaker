/*
 *  Copyright (C) 2013 VMware, Inc. All rights reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
Grid.widgets = {
	layoutBox1: ["wm.Layout", {"_classes":{"domNode":["MainContent"]},"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		panel1: ["wm.MainContentPanel", {"height":"34px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"middle","width":"800px"}, {}, {
			label3: ["wm.Label", {"_classes":{"domNode":["SectionHeader"]},"autoSizeWidth":true,"caption":"Grid Widget Examples","padding":"4","width":"126px"}, {}, {
				format: ["wm.DataFormatter", {}, {}]
			}]
		}],
		tabLayers1: ["wm.TabLayers", {"desktopHeaderHeight":"29px","manageURL":true}, {}, {
			basic: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Basic Grid","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer1: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Basic","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			paging: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Paging","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer2: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Paging","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			searching: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Searching","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer3: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Searching","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			sorting: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Sorting","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer4: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Sorting","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			formatting: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Formatting","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer5: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Formatting","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			columns: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Calculated Columns","horizontalAlign":"left","verticalAlign":"top"}, {}, {
				pageContainer6: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Column","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			subtotal: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"Row Subtotal","horizontalAlign":"left","verticalAlign":"top"}, {"onShow":"subtotalShow"}, {
				pageContainer7: ["wm.PageContainer", {"deferLoad":true,"pageName":"Grid_Subtotals","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}],
			listViewerLayer: ["wm.Layer", {"border":"1","borderColor":"#999999","caption":"List Viewer","horizontalAlign":"left","themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
				pageContainer8: ["wm.PageContainer", {"deferLoad":true,"pageName":"ListViewer","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}]
		}]
	}]
}