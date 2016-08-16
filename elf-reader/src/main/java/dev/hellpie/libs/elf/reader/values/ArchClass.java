/*
 * Copyright 2016 Diego Rossi (@_HellPie)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.hellpie.libs.elf.reader.values;

public enum ArchClass {

	CLASS_ARCH32(1),
	CLASS_ARCH64(2),
	CLASS_ARCH_UNKNOWN(0);

	public final int VALUE;

	ArchClass(int value) {
		VALUE = value;
	}

	public static ArchClass get(int value) {
		switch(value) {
			case 1:
				return CLASS_ARCH32;
			case 2:
				return CLASS_ARCH64;
			default:
				return CLASS_ARCH_UNKNOWN;
		}
	}
}
