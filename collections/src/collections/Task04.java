package collections;

public class Task04  implements Comparable<Task04>{
	private  int empid;
	@Override
	public String toString() {
		return "Task04 [empid=" + empid + ", ename=" + ename + ", edeg=" + edeg + ", esal=" + esal + "]";
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setEdeg(String edeg) {
		this.edeg = edeg;
	}
	public void setEsal(double esal) {
		this.esal = esal;
	}
	public int getEmpid() {
		return empid;
	}
	public String getEname() {
		return ename;
	}
	public String getEdeg() {
		return edeg;
	}
	public double getEsal() {
		return esal;
	}
	public Task04(int empid, String ename, String edeg, double esal) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.edeg = edeg;
		this.esal = esal;
	}
	private String  ename;
	private String edeg;
	private double esal;

}
