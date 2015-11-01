package designpatterns.three;

public class Demo {

	public static void main(String[] args) {
		Resource workstation1 = new WorkStation("Id1", 1990, "SupervisorA", 100);
		Resource workstation2 = new WorkStation("Id2", 1992, "SupervisorB", 200);
		
		Resource printer1 = new Printer("Id3", 2000, "SupervisorC", 50);
		Resource printer2 = new Printer("Id4", 2001, "SupervisorD", 150);
		
		Cluster cluster1 = new Cluster("CId1", "Id5", "CSupervisorA");
		cluster1.addResource(workstation1);
		cluster1.addResource(workstation2);
		cluster1.addResource(printer1);
		
		cluster1.showResouceDetails();
		System.out.println("\nCost of maintanence of Cluster 1: " + cluster1.getCostOfMaintanence());
		
		Cluster cluster2 = new Cluster("CId2", "Id6", "CSupervisorB");
		cluster2.addResource(cluster1);
		cluster2.addResource(printer2);
	
		cluster2.showResouceDetails();
		System.out.println("\nCost of maintanence of Cluster 2: " + cluster2.getCostOfMaintanence());
		
		cluster2.removeResource(printer2);
		cluster2.showResouceDetails();
		System.out.println("\nCost of maintanence of Cluster 2: " + cluster2.getCostOfMaintanence());
		
		System.out.println("\nWorkStation1 is older than 1998: " + workstation1.checkOldModel(1998));
		System.out.println("Printer1 is older than 1998: " + printer1.checkOldModel(1998));
		
		System.out.println("\nResources in the Cluster2 older than 1990");
		cluster2.showOlderModels(1990);
		System.out.println("\nResources in the Cluster2 older than 1999");
		cluster2.showOlderModels(1999);
		
		System.out.println("\nWorkStation2 with Id2 is made inactive");
		workstation2.setInactive();
		workstation2.showResouceDetails();
		
		System.out.println("\nPrinter1 with Id3 in Cluster2 is made inactive");
		cluster2.setInactive("Id3");
		cluster2.showResouceDetails();
		
	}

}
