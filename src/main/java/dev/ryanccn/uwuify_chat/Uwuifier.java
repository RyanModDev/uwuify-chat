/*
The MIT License (MIT)

Copyright (c) 2022 Nafiul Islam, TreeCaptcha, RoostersEatYou

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

package dev.ryanccn.uwuify_chat;

import java.util.Random;

/**
 * This class either contains the best code or the worst code ever written
 * @author Ran
 * @author TreeCaptcha
 * @author RoostersEatYou
 */
public class Uwuifier {
	/**
	 * This uwuifier makes no guarantee that every input has the same output.
	 * Consider using uwuifySame to get the same output on each input.
	 * @param stringToUwuify - the string to be uwuified
	 * @return - the uwuified string
	 */
	public static String uwuify(String stringToUwuify) {
		Random rand = new Random();
		return stringToUwuify.toLowerCase().replaceAll("[rl]","w").replaceAll("n([aeiou])", "ny$1").replaceAll("ove", "uve").replaceAll("uck", "uwq").replaceFirst("i", "i-i").replaceFirst("(?s)(.*)" + "i-i-i", "$1" + "i-i") + ((rand.nextInt(10)) <= 2 ? " >-<" : "") + ((rand.nextInt(10)) <= 1 ? " uwu" : "");
	}
}
