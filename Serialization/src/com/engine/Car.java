package com.engine;
public class Car
{
private String regno;
private String carno;
public String getRegno() {
	return regno;
}
public void setRegno(String regno) {
	this.regno = regno;
}
public String getCarno() {
	return carno;
}
public void setCarno(String carno) {
	this.carno = carno;
}
public Car(String regno, String carno) {
	this.regno = regno;
	this.carno = carno;
}

}
