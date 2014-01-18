/*
 * Copyright (c) 2009 OrangeSignal.com All rights reserved.
 *
 * これは Apache ライセンス Version 2.0 (以下、このライセンスと記述) に
 * 従っています。このライセンスに準拠する場合以外、このファイルを使用
 * してはなりません。このライセンスのコピーは以下から入手できます。
 *
 * http://www.apache.org/licenses/LICENSE-2.0.txt
 *
 * 適用可能な法律がある、あるいは文書によって明記されている場合を除き、
 * このライセンスの下で配布されているソフトウェアは、明示的であるか暗黙の
 * うちであるかを問わず、「保証やあらゆる種類の条件を含んでおらず」、
 * 「あるがまま」の状態で提供されるものとします。
 * このライセンスが適用される特定の許諾と制限については、このライセンス
 * を参照してください。
 */

package com.orangesignal.csv.manager;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import com.orangesignal.csv.entity.Price;
import com.orangesignal.csv.manager.CsvBeanSaver;

/**
 * {@link CsvBeanSaver} クラスの単体テストです。
 *
 * @author 杉澤 浩二
 */
public class CsvBeanSaverTest {

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void testCsvBeanSaverIllegalArgumentException() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("CsvConfig must not be null");
		new CsvBeanSaver<Price>(null, null, Price.class);
	}

}