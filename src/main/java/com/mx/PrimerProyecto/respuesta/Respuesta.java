package com.mx.PrimerProyecto.respuesta;

public class Respuesta {
	String msg;
	Object obj;
	boolean success;

	public Respuesta() {
	}

	public Respuesta(String msg, Object obj, boolean success) {
		this.msg = msg;
		this.obj = obj;
		this.success = success;
	
	}

	@Override
	public String toString() {
		return "Respuesta [msg=" + msg + ", obj=" + obj + ", success=" + success + "]";
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
