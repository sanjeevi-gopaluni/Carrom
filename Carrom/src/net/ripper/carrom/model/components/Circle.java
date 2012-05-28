package net.ripper.carrom.model.components;

public class Circle {
	public float radius;
	public float x;
	public float y;

	public Circle(float radius, float x, float y) {
		this.radius = radius;
		this.x = x;
		this.y = y;
	}

	public boolean isPointInCircle(float px, float py) {
		float dx = Math.abs(px - this.x);
		float dy = Math.abs(py - this.y);

		if (dx + dy <= radius)
			return true;
		if (dx > radius)
			return false;
		if (dy > radius)
			return false;
		if (dx * dx + dy * dy <= radius * radius)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "< r=" + radius + " x=" + x + " y=" + y + " >";
	}
}
