
package com.scaler.LLD.penCaseStudy.pens;

import com.scaler.LLD.penCaseStudy.Refil;
import com.scaler.LLD.penCaseStudy.writestrategies.WriteStrategy;

public class GelPen extends Pen {
    public GelPen(WriteStrategy writeStrategy) {
		super(writeStrategy);
		
	}

	private Refil refil;

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