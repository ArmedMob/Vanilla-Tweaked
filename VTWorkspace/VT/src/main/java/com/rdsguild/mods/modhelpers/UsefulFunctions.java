package com.rdsguild.mods.modhelpers;

import net.minecraft.util.math.Vec3d;

public class UsefulFunctions {

	public static double interpolate(double x, double x1, double x2, double y1, double y2) {
		if (x1 > x2) {
			double temp = x1; x1 = x2; x2 = temp;
			temp = y1; y1 = y2; y2 = temp;
		}
		
		if (x <= x1) return y1;
		if (x >= x2) return y2;
		double xFraction = (x -x1) / (x2 -x1);
		return y1 + xFraction * (y2 - y1);
	}
	
	public static Vec3d scalarMultipy(Vec3d source, double multiplyer) {
		return new Vec3d(source.xCoord * multiplyer, source.yCoord * multiplyer, source.zCoord * multiplyer);
	}
}
