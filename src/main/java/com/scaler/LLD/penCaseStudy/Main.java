package com.scaler.LLD.penCaseStudy;

import com.scaler.LLD.penCaseStudy.pens.BallPen;
import com.scaler.LLD.penCaseStudy.pens.Pen;
import com.scaler.LLD.penCaseStudy.writestrategies.SmoothWriteStrategy;

public class Main {
	public static void main(String[] args) {
		Pen reynoldsTrimax = new BallPen(new SmoothWriteStrategy());
		reynoldsTrimax.getWriteStrategy().writeBehaviour();

	}
}
