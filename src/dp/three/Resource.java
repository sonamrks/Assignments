package dp.three;

import java.util.List;

public interface Resource {
	
	public String getResourceId();
	public void setResourceId(String resourceId);
	public String getClusterId();
	public void setClusterId(String clusterId);
	public int getModelYear();
	public void setModelYear(int modelYear);
	public String getStatus();
	public void setActive();
	public void setInactive();
	public void setInactive(String resourceId);
	public String getSupervisor();
	public void setSupervisor(String supervisor);	
	public void addResource(Resource resource);
	public void removeResource(Resource resource);
	public List<Resource> getResources();
	public Resource getResource(int id);
	public double getCostOfMaintanence();
	public void setCostOfMaintanence(double costOfMaintanence);
	public void showResouceDetails();
	public boolean checkOldModel(int year);
	public void showOlderModels(int year) ;
	
}
