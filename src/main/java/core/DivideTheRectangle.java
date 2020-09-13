//Рисунок ниже дает представление о том, как разрезать данный "истинный" прямоугольник на 
//квадраты ("истинный" прямоугольник означает, что два измерения различны).
//Можете ли вы перевести этот рисунок в алгоритм?
//Вам будут даны два измерения:
//положительная целочисленная длина (параметр с именем lng)
//положительная целочисленная ширина (параметр с именем wdth)
//Вы вернете массив или строку (в зависимости от языка; оболочки bash, PowerShell и Fortran 
//возвращают строку) с размером каждого из квадратов.
//lng == width в качестве начального случая была бы совершенно другая проблема, 
//и чертеж планируется интерпретировать с помощью lng != wdth. 
//(См. ката, квадрат в квадраты. Берегите деревья! 
//http://www.codewars.com/kata/54eb33e5bc1a25440d000891 для этой задачи).
//Когда начальные параметры таковы, что lng == wdth, решение [lng] будет наиболее очевидным, 
//но не в духе этого ката, поэтому в этом случае возвращайте None/nil/null/Nothing
//возвращение {} в C++ массив() со скалярным.
//В этом случае возвращаемая структура C будет иметь свою составляющую sz, равную 0.
//Верните строку " nil " с помощью Bash, PowerShell и Fortran.

package core;

import java.util.ArrayList;
import java.util.List;

public class DivideTheRectangle {

	public static Integer SmOrBig(Integer v, Integer sh) {
		if (v > sh) {
			return sh;
		} else
			return v;
	}

	public static Integer Sq1(Integer v, Integer sh, Integer a) {
		if (v > sh) {
			v = v - a;
		}
		if (v < sh) {
			v = v;
		}

		return v;
	}

	public static Integer Sq2(Integer b, Integer sh, Integer a) {
		if (b > sh) {
			sh = sh;
		}
		if (b < sh) {
			sh = sh - a;
		}

		return sh;
	}

	public static List<Integer> SqInRect(Integer v, Integer sh) {

		List<Integer> x = new ArrayList<Integer>();

		Integer a = 0;

		while (sh != v) {
			int b = v;
			v = Sq1(v, sh, a);
			sh = Sq2(b, sh, a);
			a = SmOrBig(v, sh);
			x.add(a);
		}

		for (int i = 0; i < x.size(); i++) {
			System.out.println((x.get(i)).toString());
		}

		return null;
	}

	public static void main(String[] args) {

		Integer v = 7;
		Integer sh = 9;
		SqInRect(v, sh);
	}
}
