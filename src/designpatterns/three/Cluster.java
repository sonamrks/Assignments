package designpatterns.three;

import java.util.ArrayList;
import java.util.List;

public class Cluster implements Resource {
	private List<Resource> cluster = new ArrayList<Resource>();
	private String clusterId;
	private String resourceId;
	private String status;
	private String supervisor;
	private double costOfMaintanence;
	
	public Cluster(String clusterId, String resourceId, String supervisor) {
		this.clusterId = clusterId;
		this.resourceId = resourceId;
		this.status = "active";
		this.supervisor = supervisor;
		
		System.out.println("\nInitiating cluster with Resource Id: " + resourceId + " & Cluster Id: " + clusterId);
	}
	
	@Override
	public String getResourceId() {
		return resourceId;
	}
	
	@Override
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	@Override
	public String getClusterId() {
		return clusterId;
	}

	@Override
	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}
	
	@Override
	public int getModelYear() {
		return 0;
	}
	
	@Override
	public void setModelYear(int modelYear) {
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
		for(Resource resource : cluster) {
			if(resource instanceof Cluster) {
				resource.setInactive(resourceId);
			}
			else {
				if(resource.getResourceId() == resourceId) {
					resource.setInactive();
				}
			}
		}
	}
	
	@Override
	public String getSupervisor() {
		return supervisor;
	}
	
	@Override
	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
		for(Resource resource : cluster) {
			resource.setSupervisor(supervisor);
		}
	}
	
	@Override
	public void addResource(Resource resource) {
		System.out.println("Adding resource: " + resource.getResourceId());
		resource.setSupervisor(supervisor);
		cluster.add(resource);
	}
	
	@Override
	public void removeResource(Resource resource) {
		System.out.println("\nRemoving resource: " + resource.getResourceId());
		resource.setInactive();
	}
	
	@Override
	public List<Resource> getResources() {
		return cluster;
	}
	
	@Override
	public Resource getResource(int id) {
		return cluster.get(id);
	}
	
	@Override
	public double getCostOfMaintanence() {
		costOfMaintanence = 0;
		for(Resource resource : cluster) {
			if(resource.getStatus() == "active") {
				costOfMaintanence += resource.getCostOfMaintanence();
			}
		}
		return costOfMaintanence;
	}
	
	@Override
	public void setCostOfMaintanence(double costOfMaintanence) {
	}
	
	@Override
	public void showResouceDetails() {
		System.out.println("\n************* CLUSTER DETAILS ************* ");
		System.out.println("Cluster Id: " + clusterId);
		System.out.println("Resource Id: " + resourceId);
		System.out.println("Supervisor: " + supervisor);
		System.out.println("\nResources: ");
		for(Resource resource : cluster) {
			if(resource instanceof Cluster) {
				System.out.println("  resourceId=" + resource.getResourceId() + " which is a cluster containing:");
				for (Resource cresource: resource.getResources()) {
					System.out.print("\t");
					cresource.showResouceDetails();
				}
			}
			else {
				resource.showResouceDetails();
			}
		}
		System.out.println("******************************************** ");
	}
	
	@Override
	public boolean checkOldModel(int year) {
		return false;
	}
		
	@Override
	public void showOlderModels(int year) {
		for(Resource resource : cluster) {
			if(resource instanceof Cluster) {
				resource.showOlderModels(year);
			}
			else {
				if(resource.checkOldModel(year)) {
					System.out.println("  "+ resource.getResourceId() + " : " + resource.getStatus());
				}
			}
		}
	}

}
