package ArrayListCollections;

import java.util.ArrayList;

import ArrayListComparable.JobCandidate;
import ArrayListComparable.JobCandidateSorter;

public class SortArrayListAscendingDescendingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> countryList = new ArrayList<>();         
		    countryList.add("France");         
		    countryList.add("USA");         
		    countryList.add("India");         
		    countryList.add("Spain");         
		    countryList.add("England");
		    
		    ArraysListSort sortArrayList = new ArraysListSort(countryList);         
		    ArrayList<String> unsortedArrayList = sortArrayList.getArrayList();         
		    System.out.println("Unsorted ArrayList: " + unsortedArrayList);         
		    ArrayList<String> sortedArrayListAscending = sortArrayList.sortAscending();         
		    System.out.println("Sorted ArrayList in Ascending Order : " + sortedArrayListAscending);         
		    ArrayList<String> sortedArrayListDescending = sortArrayList.sortDescending();         
		    System.out.println("Sorted ArrayList in Descending Order: " + sortedArrayListDescending); 

		    JobCandidate jobCandidate1 = new JobCandidate("Mark Smith", "Male", 26);         
		    JobCandidate jobCandidate2 = new JobCandidate("Sandy Hunt", "Female", 23);         
		    JobCandidate jobCandidate3 = new JobCandidate("Betty Clark", "Female", 20);         
		    JobCandidate jobCandidate4 = new JobCandidate("Andrew Styne", "Male", 24);         
		    ArrayList<JobCandidate> jobCandidateList = new ArrayList<>();         
		    jobCandidateList.add(jobCandidate1);         
		    jobCandidateList.add(jobCandidate2);         
		    jobCandidateList.add(jobCandidate3);         
		    jobCandidateList.add(jobCandidate4);         
		    JobCandidateSorter jobCandidateSorter = new JobCandidateSorter(jobCandidateList);         
		    ArrayList<JobCandidate> sortedJobCandidate = jobCandidateSorter.getSortedJobCandidateByAge();         
		    System.out.println("-----Sorted JobCandidate by age: Ascending-----");         
		    for (JobCandidate jobCandidate : sortedJobCandidate) {             
		      System.out.println(jobCandidate);         
		    }       
	
	}

}
