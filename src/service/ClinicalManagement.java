package service;

import model.*;

public class ClinicalManagement {
    public void addStaff(MedicalClinic clinic, MedicalStaff staff) {
        int nextAvailableIndex = getNumberOfStaff(clinic);
        clinic.getStaff()[nextAvailableIndex] = staff;
    }

    public void addPatient(MedicalClinic clinic, Patient patient) {
        int nextAvailableIndex = getNumberOfPatients(clinic);
        clinic.getPatients()[nextAvailableIndex] = patient;
    }

    public void addAppointment(MedicalClinic clinic, Appointment app) {
        int nextAvailableIndex = getNumberOfPatients(clinic);
        clinic.getAppointments()[nextAvailableIndex] = app;
    }

    public void printStaffDetails(MedicalClinic clinic) {
        for(MedicalStaff p : clinic.getStaff()) {
            if(p != null) {
                System.out.println(p);
            }
        }
    }

    private int getNumberOfStaff(MedicalClinic clinic) {
        int numberOfStaff = 0;
        for(MedicalStaff p : clinic.getStaff()) {
            if(p != null) {
                numberOfStaff++;
            }
        }
        return numberOfStaff;
    }

    public void printPatientsDetails(MedicalClinic clinic) {
        for(Patient p : clinic.getPatients()) {
            if(p != null) {
                System.out.println(p);
            }
        }
    }

    private int getNumberOfPatients(MedicalClinic clinic) {
        int numberOfPatients = 0;
        for(Patient p : clinic.getPatients()) {
            if(p != null) {
                numberOfPatients++;
            }
        }
        return numberOfPatients;
    }

    public void printAppointmentsDetails(MedicalClinic clinic) {
        for(Appointment a : clinic.getAppointments()) {
            if(a != null) {
                System.out.println(a);
            }
        }
    }

    private int getNumberOfAppointments(MedicalClinic clinic) {
        int numberOfAppointments = 0;
        for(Appointment a : clinic.getAppointments()) {
            if(a != null) {
                numberOfAppointments++;
            }
        }
        return numberOfAppointments;
    }
}
