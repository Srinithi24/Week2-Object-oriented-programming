import java.util.*;
class Hospital{
	class Doctor{
		private String name;
		private List<Patient>patients = new ArrayList<>();
		public Doctor(String name){
			this.name = name;
		}
		public void consult(Patient patient, String complaint){
			System.out.println("Consultation: ");
			System.out.println(name+ " : Hi! "+patient.name+" What is your problem?");
			System.out.println(patient.name+ " : Hi! "+name+" I have "+complaint);
			System.out.println(name+ " : Nothing to worry  "+patient.name+". Here's the prescription.");
			String consultationDetails = ("Consultation with "+name+" for "+patient.name+" the complaint is "+complaint);
			
			if(!patients.contains(patient)){
				patients.add(patient);
				patient.doctors.add(this);
			}
		}
		public void listPatient(){
			System.out.println(name + "'s patients: ");
			for(Patient p: patients){
				System.out.println("- "+p.name);
			}
		}
	}
	class Patient{
		private String name;
		private List<Doctor> doctors = new ArrayList<>();
		Patient(String name){
			this.name = name;
		}
		public void listDoctors(){
			System.out.println(name +"'s doctors: ");
			for(Doctor d: doctors){
				System.out.println("- " + d.name);
			}
		}
	}
	public static void main(String[] args){
		Hospital hospital = new Hospital();
		Doctor drRam = hospital.new Doctor("Dr Ram");
		Doctor drSri = hospital.new Doctor("Dr Sri");
		Patient sandy = hospital.new Patient("Sandy");
		Patient maddy = hospital.new Patient("Maddy");
		
		drSri.consult(sandy, "Fever");
		drRam.consult(maddy, "Headache");
		drRam.consult(sandy, "knee pain");
		
		drSri.listPatient();
		drRam.listPatient();
		sandy.listDoctors();
		maddy.listDoctors();
	}
}