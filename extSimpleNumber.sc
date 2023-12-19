+ SimpleNumber {

	adjustOctave{|base = 2|
		^(this/this.previousPowerOf(base))
	}
}
