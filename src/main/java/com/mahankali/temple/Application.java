package com.mahankali.temple;

import com.mahankali.temple.dto.DonatorsDTO;
import com.mahankali.temple.dto.Estimations;
import com.mahankali.temple.dto.MembershipDTO;
import com.mahankali.temple.repo.DonatorsRepo;
import com.mahankali.temple.repo.EstimationsRepo;
import com.mahankali.temple.repo.MembershipsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private DonatorsRepo donatorsRepo;

    @Autowired
    private EstimationsRepo estimationsRepo;

    @Autowired
    private MembershipsRepo membershipsRepo;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @PostConstruct
    public void saveChandaList() {
        List<DonatorsDTO> list = new LinkedList<>();
        list.add(new DonatorsDTO(1, "Anantula Raji Reddy", "Nagole", "50000", "Pending", "", "9703332464", "30/03/2024"));
        list.add(new DonatorsDTO(2, "Ragiri ChandraMohan Goud", "Nuvvulabanda", "150000", "Pending", "Mahankali Vigraham", "", "30/03/2024"));
        list.add(new DonatorsDTO(3, "Gurja Narasimha Goud", "Nuvvulabanda", "100000", "Pending", "", "", "30/03/2024"));
        list.add(new DonatorsDTO(4, "Chintala Aurna Surendar Yadav(Corporator) ", "Nagole", "150000", "Pending", "Granite Required for Construction", "", "30/03/2024"));
        list.add(new DonatorsDTO(5, "Kolan Prabhaker Goud(ChandraShekar Azad)", "Nagole", "50000", "Pending", "", "", "30/03/2024"));
        list.add(new DonatorsDTO(6, "Cheruku Krishna Goud(Chiranheevi Goud)", "Nagole", "80400", "Pending", "201 cement bags", "", "30/03/2024"));
        list.add(new DonatorsDTO(7, "Bandra Suguna(Srinivas, Srikanth)", "Nuvvulabanda", "60000", "Received", "Borewell", "9959159050", "30/03/2024"));
        list.add(new DonatorsDTO(8, "Nari Bikshapathi", "Nuvvulabanda", "50000", "Pending", "", "", "30/03/2024"));
        list.add(new DonatorsDTO(9, "Ganamaina Ramulu(Jagan)", "Nuvvulabanda", "100000", "Pending", "Mahankali Temple Main Door", "9700970900", "30/03/2024"));
        list.add(new DonatorsDTO(10, "A Murali Goud", "Nuvvulabanda", "30000", "Pending", "Simham Balipeetam", "", "30/03/2024"));
        list.add(new DonatorsDTO(11, "Gangadevi Shyam Mudhiraj", "Nagole", "25000", "Pending", "", "", "30/03/2024"));
        list.add(new DonatorsDTO(12, "Badam Ravinder Goud(late Baddam Mahender Goud)", "Jaipuricolony", "50000", "Pending", "", "", "31/03/2024"));
        list.add(new DonatorsDTO(13, "Ravula Ranjith Goud", "Blindscolony", "40000", "Pending", "Granite Main Door Frame", "", "31/03/2024"));
        list.add(new DonatorsDTO(14, "Ravula Jayaram Goud", "Blindscolony", "20000", "Pending", "20 bags Cement", "9290747630", "31/03/2024"));
        list.add(new DonatorsDTO(15, "Uppala Srinivas", "Nagole", "20000", "Pending", "50 bags Cement", "", "31/03/2024"));
        list.add(new DonatorsDTO(16, "Chintala Kiran Kumar Yadav", "Nagole", "50000", "Pending", "", "", "31/03/2024"));
        list.add(new DonatorsDTO(17, "Kandi Kanti Tanuja Khanna Goud", "Nagole", "25000", "Pending", "Reminder before 3 weeks", "", "31/03/2024"));
        list.add(new DonatorsDTO(18, "Baddam Narender Goud", "Nagole", "50000", "Pending", "Gold", "", "31/03/2024"));
        list.add(new DonatorsDTO(19, "Chinthula Prakash Goud(Sai)", "Nagole", "70000", "Pending", "1 Ton steel", "", "31/03/2024"));
        list.add(new DonatorsDTO(20, "Vaspari Mallesh", "Nagole", "21000", "Pending", "", "", "05/04/2024"));
        list.add(new DonatorsDTO(21, "Palle SitaRamulu Goud", "Nagole", "11000", "Pending", "", "", "05/04/2024"));
        list.add(new DonatorsDTO(22, "Oruganti Ajay & Brothers", "Nagole", "41000", "Pending", "11k cash and centring boxes for slab", "7842111333", "05/04/2024"));
        list.add(new DonatorsDTO(23, "CH Jangaiah Goud", "Nagole", "51000", "Pending", "", "", "05/04/2024"));
        list.add(new DonatorsDTO(24, "Chitrala Jagadish", "Nagole", "40000", "Pending", "100 bags cement", "", "06/04/2024"));
        list.add(new DonatorsDTO(25, "Cheruku Prasad Goud", "Nagole", "0", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(26, "Akki Kishore", "Nagole", "25000", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(27, "Cheruku Papaiah", "Nagole", "21000", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(28, "Baddam Bhargavi Dhananjaya Goud", "Nagole", "21500", "Pending", "", "", "07/04/2024"));


        donatorsRepo.saveAll(list);

        System.out.println("Details saved");


    }

    @PostConstruct
    public void loadEstimations() {
        List<Estimations> estimations = new LinkedList<>();
        estimations.add(new Estimations(1, "Only Temple Design and Construction", "900000", ""));
        estimations.add(new Estimations(2, "Temple Design and Construction ", "300000", ""));
        estimations.add(new Estimations(3, "Total Cement Bags ", "0", ""));
        estimations.add(new Estimations(4, "Total Brick loads ", "0", ""));
        estimations.add(new Estimations(5, "Total Sand loads ", "0", ""));
        estimations.add(new Estimations(6, "Total Steel ", "210000", "3 tons"));
        estimations.add(new Estimations(7, "Tree Cutting ", "9000", ""));
        estimations.add(new Estimations(8, "JCB and Tractor charges ", "12900", ""));

        estimationsRepo.saveAll(estimations);
    }

    @PostConstruct
    public void memberships() {
        List<MembershipDTO> membershipDTOList = new ArrayList<>();

		membershipDTOList.add(new MembershipDTO(1,"Cheruku Nageshwar Goud","1/6",11000,"Pending","",""));
		membershipDTOList.add(new MembershipDTO(2,"CH Purushotham","2/22",11000,"Pending","",""));
		membershipDTOList.add(new MembershipDTO(3,"Macharla Kumar Goud","18/455",11000,"Pending","",""));
		membershipDTOList.add(new MembershipDTO(4,"DevaNarayana Sharma","18/459",11000,"Pending","","9396810028"));
		membershipDTOList.add(new MembershipDTO(5,"Nagulancha Krishna","14/468",11000,"Pending","",""));
		membershipDTOList.add(new MembershipDTO(6,"Ravula Yadagiri MUdhiraj","14/500",11000,"Pending","Chinna Bangaru Pusthe Mettalu",""));
		membershipDTOList.add(new MembershipDTO(7,"Gaddam Anjalaiah Goud","16/288",11000,"Pending","Pedha Bangaru Pusthe Mettalu",""));
        membershipsRepo.saveAll(membershipDTOList);
    }


}
