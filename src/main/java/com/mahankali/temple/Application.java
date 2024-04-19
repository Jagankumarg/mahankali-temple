package com.mahankali.temple;

import com.mahankali.temple.dto.*;
import com.mahankali.temple.repo.*;
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

    @Autowired
    private VillageDonationsRepo villageDonationsRepo;

    @Autowired
    private ExpensesRepo expensesRepo;

    @Autowired
    private AmountReceivedRepo amountReceivedRepo;

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
        list.add(new DonatorsDTO(6, "Cheruku Krishna Goud(Chiranjeevi Goud)", "Nagole", "80400", "Pending", "201 cement bags", "", "30/03/2024"));
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
        list.add(new DonatorsDTO(23, "CH Jangaiah Goud", "Nagole", "24000", "Pending", "Received 27000", "", "05/04/2024"));
        list.add(new DonatorsDTO(24, "Chitrala Jagadish", "Nagole", "40000", "Pending", "100 bags cement", "", "06/04/2024"));
        list.add(new DonatorsDTO(25, "Cheruku Prasad Goud", "Nagole", "0", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(26, "Akki Kishore", "Nagole", "25000", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(27, "Cheruku Papaiah", "Nagole", "21000", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(28, "Baddam Bhargavi Dhananjaya Goud", "Nagole", "21500", "Pending", "", "", "07/04/2024"));
        list.add(new DonatorsDTO(29, "Toorpati Chiranjeevi", "Bandlaguda", "12000", "Pending", "", "", "11/04/2024"));
        list.add(new DonatorsDTO(30, "CH Vijay Kumar Goud", "1/3", "11000", "Pending", "", "", "11/04/2024"));
        list.add(new DonatorsDTO(31, "Maroju Radha Krishna Chary", "12/315", "50000", "Pending", "", "", "14/04/2024"));
        list.add(new DonatorsDTO(32, "Pabbu Ellaiah", "", "25000", "Pending", "", "", "14/04/2024"));
        list.add(new DonatorsDTO(33, "Kothuru Sai Reddy", "Rationshop", "25000", "Pending", "25 Tulas Silver", "", "14/04/2024"));


        donatorsRepo.saveAll(list);

        System.out.println("Details saved");


    }

    @PostConstruct
    public void loadEstimations() {
        List<Estimations> estimations = new LinkedList<>();
        estimations.add(new Estimations(1, "Temple Design and Construction", "600000", ""));
        estimations.add(new Estimations(2, "Temple Basement and Compound Wall ", "200000", ""));
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

		membershipDTOList.add(new MembershipDTO(1,"Cheruku Nageshwar Goud","1/6",11000,"Pending","","",""));
		membershipDTOList.add(new MembershipDTO(2,"CH Purushotham","2/22",11000,"Pending","","",""));
		membershipDTOList.add(new MembershipDTO(3,"Macharla Kumar Goud","18/455",11000,"Pending","","",""));
		membershipDTOList.add(new MembershipDTO(4,"DevaNarayana Sharma","18/459",11000,"Received","","9396810028",""));
		membershipDTOList.add(new MembershipDTO(5,"Nagulancha Krishna","14/468",11000,"Pending","","",""));
		membershipDTOList.add(new MembershipDTO(6,"Ravula Yadagiri Mudhiraj","14/500",11000,"Pending","Chinna Bangaru Pusthe Mettalu","",""));
		membershipDTOList.add(new MembershipDTO(7,"Gaddam Anjalaiah Goud","16/288",11000,"Pending","Pedha Bangaru Pusthe Mettalu","",""));
        membershipDTOList.add(new MembershipDTO(8,"Vecham Subramaniam","9/159",20250,"Pending","Ornament 25 Tulas Silver  ","",""));
        membershipDTOList.add(new MembershipDTO(9,"Palle Venkatesh Goud","9/155",11016,"Pending"," ","",""));
        membershipDTOList.add(new MembershipDTO(10,"Sathuri Allaji Goud","1/136",11000,"Pending"," ","",""));
        membershipDTOList.add(new MembershipDTO(11,"Edure Ramulu(Current Ramulu)","1/130",11000,"Received"," ","",""));
        membershipDTOList.add(new MembershipDTO(12,"Damanolla Anjamma Yadav(Mirchi bandi)","11/304",11000,"Pending"," ","",""));
        membershipDTOList.add(new MembershipDTO(13,"Karing Yadaiah","12/340",50000,"Pending"," ","",""));
        membershipDTOList.add(new MembershipDTO(14,"Bandari Suresh","12/312",11000,"Pending"," ","",""));
        membershipDTOList.add(new MembershipDTO(15,"Pagilla Nagababu","12/332",11000,"Pending","Centring labour expenses","","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(16,"Tanthrapelli Balaiah Goud","12/310",50000,"Pending","","","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(17,"Edla Venkatesh","12/325",11000,"Pending","","","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(18,"M Shivalingam Goud","12/326",11000,"Pending","","","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(19,"Palusa Sravanthi Rajesh Goud","10/207",15016,"Pending","","9032766626","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(20,"Madhapuram Raju(Naresh HMWS)","10/200",11000,"Pending","","8702169859","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(21,"Bhushetti SaiPrakash","10/234",11000,"Pending","","9963210715","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(22,"Gopishetty Madhu","11/237",11000,"Pending","","","13/4/2024"));
        membershipDTOList.add(new MembershipDTO(23,"Gujja Venkatesh Yadav ","",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(24,"Nenavath Kotesh Nayak ","1/137",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(25,"Makthala Yadaiah Goud(Pandu Goud) ","12/316",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(26,"Kurella Mallaiah Chary ","12/310",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(27,"Gaddam Jangaiah Goud ","12/320",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(28,"Budidha Narayana Goud ","12/322",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(29,"Gangadevi Yadaiah Mudhiraj(Raju) ","12/327",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(30,"Karre Krishna ","12/328",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(31,"PachiPalla Ramesh Yadav ","12/324",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(32,"Maakam Yadaiah ","13/342",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(33,"Dunaka Santosh ","",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(34,"Aalyul Narayana Goud ","13/344",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(35,"Gattu Thirupathaiah Goud ","13/34",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(36,"Cheruku Swaroopa ","13/345",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(37,"Sawanth Devkaran ","13/350",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(38,"Pochamapalli Ravinder","13/347",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(39,"Gurrala Satyanarayana","13/355",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(40,"Gajje Ravinder Yadav","13/363",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(41,"Rallabandi Ramachary","14/382",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(42,"Doddi Mallaiah","15/390",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(43,"Sangishetty Shekar","10/197",40000,"Pending","1/2 Tulam Gold","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(44,"Nounde Ramchander","10/194",100000,"Pending","2 Gates","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(45,"Ghosh Balaram Yadav","9/154",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(46,"Palle Swaroopa Mallesh","9/150",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(47,"Cheruku Venkatesh Goud","1/135",11000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(48,"Goshetty Srinivas","10/207",21000,"Pending","","","14/4/2024"));
        membershipDTOList.add(new MembershipDTO(49,"Veedu Venkat Reddy","10/200 & 199",11111,"Pending","","","18/4/2024"));
        membershipDTOList.add(new MembershipDTO(50,"Somraju Yadaiah","10/218",11111,"Pending","","","18/4/2024"));
        membershipDTOList.add(new MembershipDTO(51,"Medcharla Satyanarayana Chary","10/221",35000,"Pending","","","18/4/2024"));
        membershipDTOList.add(new MembershipDTO(52,"Bongiri Krishna","10/209",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(53,"Gurram Raghavulu Raja Praveen ","10/",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(54,"Boodidha Yashwanth Goud ","9/181",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(55,"Bogini Raju(Pandu) ","9/179",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(56,"Gangadevi Narasimha ","9/171",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(57,"Mudheli Venkatesh Goud ","9/169(Original to be updated)",50000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(58,"Maroju Yadagiri Chary ","9/165",11000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(59,"Purigilla Venkatesh Goud ","9/165",50000,"Pending","","","19/4/2024"));
        membershipDTOList.add(new MembershipDTO(60,"PuligamPalli Srisailam","9/164",11000,"Pending","","","19/4/2024"));
        membershipsRepo.saveAll(membershipDTOList);
    }

    @PostConstruct

    public void saveVillageDonations(){
    List<VillageDonationsDTO> villageDonationsDTOS = new ArrayList<>();
        villageDonationsDTOS.add(new VillageDonationsDTO(1,"Bangara Srinivas Goud","9/149",5000,"Received(check)"," ","8309986792"));
        villageDonationsDTOS.add(new VillageDonationsDTO(2,"Chitrala Srinivas Goud","9/151",5000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(3,"Nadikottu Shivakumar Saloon","6/92",5000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(4,"Bandaru Ramesh","6/92",1000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(5,"Maroju Nagabhushana Chary","11/311",2000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(6,"Maroju Govardhana Chary","12/308",2000,"Received"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(7,"Mohammed Yakub","",4000,"Pending","10 Plastic chairs ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(8,"P Narender Goud","",1116,"Received","",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(9,"B Sanjay kumar","10/193",2000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(10,"Pabbu Narasimha","15/385",5016,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(11,"Surugu Upender","15/393",5016,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(12,"Lingala Narender Goud","14/449",2000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(13,"Sidhu kumar(Auto)","",1500,"Received"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(14,"Gundrathi Raman Goud","10/193",1000,"Received"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(15,"Namani Praveen Kumar","9/180",2222,"Pending"," ","9247329483"));
        villageDonationsDTOS.add(new VillageDonationsDTO(16,"Madhava","",2000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(17,"Badri Saalamma","9/168",1111,"Pending"," ",""));
        villageDonationsRepo.saveAll(villageDonationsDTOS);
    }

    @PostConstruct
    public void loadExpensesList(){

        List<ExpensesDTO> expensesList = new ArrayList<>();
        expensesList.add(new ExpensesDTO(1,"17/3/24","Pooja",365,"","","",""));
        expensesList.add(new ExpensesDTO(2,"17/3/24","Tree Cutting",9000,"","","",""));
        expensesList.add(new ExpensesDTO(3,"17/3/24","Chanda Books Printing",3200,"","","",""));
        expensesList.add(new ExpensesDTO(4,"17/3/24","JCB & Cleaning",12900,"","","",""));
        expensesList.add(new ExpensesDTO(5,"31/3/24","Tea & Tiffin",480,"","","",""));
        expensesList.add(new ExpensesDTO(6,"31/3/24","Tiffin",240,"","","",""));
        expensesList.add(new ExpensesDTO(7,"07/4/24","Tea",80,"","","",""));
        expensesList.add(new ExpensesDTO(8,"14/4/24","Pooja Essentials",10329,"","","Pooja Store",""));
        expensesList.add(new ExpensesDTO(9,"14/4/24","Tea & Snacks",0,"","","",""));
        expensesList.add(new ExpensesDTO(10,"14/4/24","Stationary",340,"pens,register,billbook,xerox","Jagan","Shop Owner","Padma Rao"));
        expensesList.add(new ExpensesDTO(11,"14/4/24","JCB Driver Tip",300,"pens,register,billbook,xerox","Jagan","JCB Driver","Murali Goud"));
        expensesList.add(new ExpensesDTO(12,"14/4/24","JCB charges",3000,"3 hours","","",""));
        expensesList.add(new ExpensesDTO(13,"14/4/24","Tractor Charges",2000,"2 Trips","","",""));
        expensesList.add(new ExpensesDTO(14,"14/4/24","Fruits and Garland",0,"","Chinna Goud","Shop Owner",""));
        expensesList.add(new ExpensesDTO(15,"15/4/24","Advance Towards Construction",50000,"","Temple Committee","Vijay","Temple Committee"));
        expensesList.add(new ExpensesDTO(16,"15/4/24","Tent house",900,"","","",""));
        expensesList.add(new ExpensesDTO(17,"15/4/24","Sound & Mike",2000,"","","",""));
        expensesList.add(new ExpensesDTO(18,"15/4/24","Pooja Fee",0,"","","",""));
        expensesList.add(new ExpensesDTO(19,"15/4/24","Pooja Day Construction Material",0,"trolley sand,cement and bricks","","",""));
        expensesList.add(new ExpensesDTO(20,"15/4/24","Curd",50,"","","",""));

        expensesRepo.saveAll(expensesList);
    }

    @PostConstruct
    public void loadAmountDetails(){

        List<AmountReceivedDTO> amountReceivedDTOS = new ArrayList<>();

        amountReceivedDTOS.add(new AmountReceivedDTO(1,"Bandra Suguna(Srinivas, Srikanth)",58000));
        amountReceivedDTOS.add(new AmountReceivedDTO(2,"Bangara Srinivas Goud",5000));
        amountReceivedDTOS.add(new AmountReceivedDTO(3,"Maroju Govardhana Chary",2000));
        amountReceivedDTOS.add(new AmountReceivedDTO(4,"P Narender Goud",1116));
        amountReceivedDTOS.add(new AmountReceivedDTO(5,"Sidhu kumar(Auto)",1500));
        amountReceivedDTOS.add(new AmountReceivedDTO(6,"Gundrathi Raman Goud",1000));
        amountReceivedDTOS.add(new AmountReceivedDTO(7,"Deva Narayana Sharma",11000));
        amountReceivedDTOS.add(new AmountReceivedDTO(8,"Edure Ramulu(Current Ramulu)",11000));
        amountReceivedDTOS.add(new AmountReceivedDTO(8,"CH Jangaiah Goud",27000));
        amountReceivedRepo.saveAll(amountReceivedDTOS);
    }


}
