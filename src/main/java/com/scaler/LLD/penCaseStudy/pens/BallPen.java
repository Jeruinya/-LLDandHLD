
package com.scaler.LLD.penCaseStudy.pens;

import com.scaler.LLD.penCaseStudy.Refil;
import com.scaler.LLD.penCaseStudy.writestrategies.WriteStrategy;

public class BallPen extends Pen {
	private Refil refil;

	public BallPen(WriteStrategy writeStrategy) {
		super(writeStrategy);
	}

	public Refil getRefil() {
		return refil;
	}

	public void setRefil(Refil refil) {
		this.refil = refil;
	}

	@Override
	public void write() {

	}
}
