package dp.three;

import java.util.List;

public class WorkStation implements Resource {
	private String resourceId;
	private int modelYear;
	private String status;
	private String supervisor;
	private double costOfMaintanence;
	
	public WorkStation(String resourceId, int modelYear, String supervisor, double costOfMaintanence) {
		this.resourceId = resourceId;
		this.modelYear= modelYear;
		status = "active";
		this.supervisor = supervisor;
		this.costOfMaintanence = costOfMaintanence;	
		
		System.out.println("Initiating workstation with Resource Id: " + resourceId);
	}
	
	@Override
	public String getResourceId() {
		return this.resourceId;
	}

	@Override
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	@Override
	public String getClusterId() {
		return null;
	}

	@Override
	public void setClusterId(String clusterId) {		
	}
	
	@Override
	public int getModelYear() {
		return this.modelYear;
	}
	
	@Override
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	
	@Override
	public String getStatus() {
		return this.status;
	}

	@Override
	public void setActive() {
		this.status = "active";
	}
	
	@Override
	public void setInactive() {
		this.status = "inactive";
	}
	
	@Override
	public void setInactive(String resourceId) {
	}

	@Override
	public String getSupervisor() {
		return this.supervisor;
	}

	@Override
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}
	
	@Override
	public void addResource(Resource resource) {
	}
	
	@Override
	public void removeResource(Resource resource) {
	}
	
	@Override
	public List<Resource> getResources() {
		return null;
	}
	
	@Override
	public Resource getResource(int id) {
		return null;
	}
	
	@Override
	public double getCostOfMaintanence() {
		return this.costOfMaintanence;
	}

	@Override
	public void setCostOfMaintanence(double costOfMaintanence) {
		this.costOfMaintanence = costOfMaintanence;
	}
	
	@Override
	public void showResouceDetails() {
		System.out.print("  resourceId=" + resourceId);
		System.out.print(", supervisor=" + supervisor);
		System.out.print(", modelYear=" + modelYear);
		System.out.println(", status=" + status);
	}
	
	@Override
	public boolean checkOldModel(int year) {
		if(modelYear > year) {
			return true;
		}
		return false;
	}
	
	@Override
	public void showOlderModels(int year) {		
	}
	
}
