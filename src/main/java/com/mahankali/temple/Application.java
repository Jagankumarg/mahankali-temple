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

    @Autowired //test1 test2 test3 test4 test5 test6
    //test7 test8
    //test9 test10
    private AmountReceivedRepo amountReceivedRepo;

    @Autowired
    private TempleAmountDetailsRepo templeAmountDetailsRepo;

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
        membershipDTOList.add(new MembershipDTO(61,"Peerampalli Narasimha Goud","1/5",11000,"Pending","","","20/4/2024"));
        membershipDTOList.add(new MembershipDTO(62,"ShivannaGari Dhanarekha","09/157",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(63,"Dasadhi Anil Nayi","11/187",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(64,"Rachamalla Balaraju","11/186",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(65,"Viriyala Anjaiah","11/283",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(66,"Madgula Manga(Lt Srinivas)","11/276",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(67,"Nounde Narsappa","19/488",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(68,"Vallapu Jayalakshmi Raju Chary","19/485",11000,"Received","","9912904837","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(69,"Gajjae Babu Kuruma","19/482",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(70,"Kukkala Vidyasagar ","16/414",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(71,"Kukkala Ramakrishna ","16/417",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(72,"Chilukala Yadaiah Kuruma ","19/409",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(73,"CH Ramulu ","19/489",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(74,"Godhati Raju ","19/492",11000,"Pending","","","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(75,"Gajwel Bikshapathi ","11/279",11000,"Pending","","9110339186","21/4/2024"));
        membershipDTOList.add(new MembershipDTO(76,"Gangadevi Srikanth(Lt Ramaswamy) ","09/190",11000,"Pending","","","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(77,"B Shiva(Gold shop) ","11/238",11000,"Pending","","9348922221","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(78,"B Ravi Yadav ","11/247",11000,"Pending","","9666842536","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(79,"B Lingaiah ","11/250",11116,"Pending","","9441300976","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(80,"Konagala Jangaiah ","11/264",11000,"Pending","","6300956861","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(81,"Maroju Rajyalakshmi ","11/257",11000,"Pending","","9948914675","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(82,"M Sai Kishore Goud(Jangamma) ","18/460",11000,"Pending","","9948914675","22/4/2024"));
        membershipDTOList.add(new MembershipDTO(83,"S Niranjan ","10/206",11000,"Pending","","9703937676","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(84,"Lakshmi ","08/145",11000,"Pending","","","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(85,"Veerkala Ramesh ","08/144",11000,"Pending","","9441870910","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(86,"G Ramu Yadav ","08/139",11000,"Pending","","9010398283","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(87,"A Narasimha Razaka ","07/115",11000,"Pending","","9963081192","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(88,"C Venkatesh Goud","07/116",11000,"Pending","","9441876296","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(89,"A Padma","07/117",11000,"Pending","","8978337725","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(90,"B Naveen kumar","07/119",11000,"Pending","","9908803360","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(91,"Tanneru Ramaiah(T Nageshwar Rao","07/124",11000,"Pending","","9502124885","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(92,"Thalla Yadaiah Goud","07/129",11000,"Pending","","9393587019","23/4/2024"));
        membershipDTOList.add(new MembershipDTO(93,"M Anji Yadav","02/20",11000,"Pending","10 Tons Sand","9963859312","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(94,"Gudi Harish","06/963",11000,"Pending","","9603860442","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(95,"Kondapuram Ramulu ","06/98",11000,"Pending","","9346590071","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(96,"A Ramesh kumar","06/106",15000,"Pending","50 Bags Cement","9912038266","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(97,"U Yadaiah Goud(Vinod)","06/100",11000,"Pending","","8555947711","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(98,"V Naveen Sai, Bharath kumar","06/88",11000,"Pending","","9154308515","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(99,"P Shankaraiah","06/89,90,91",11000,"Pending","","9703563153","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(100,"Pangol Prem kumar(Yadamma)","01/85",11000,"Pending","","9492693354","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(101,"Gangarau Veenala Goud","05/69",11000,"Pending","","7382802294","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(102,"Pathi Madhu","05/70",11000,"Pending","","9849024845","24/4/2024"));
        membershipDTOList.add(new MembershipDTO(103,"M Mohan Yadav","01/68",15000,"Pending","50 Bags cement","9390420886","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(104,"P Bikshapathi","05/75",11000,"Pending","","9666664132","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(105,"G Gouramma Balaswamy","05/76",11000,"Pending","","9951767935","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(106,"Late Srinivas Goud(Swaroopa)","05/73",11000,"Pending","","7989546097","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(107,"CH Chandraiah","01/42",11000,"Pending","","8074432646","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(108,"T Ileshwar Goud","01/41",11000,"Pending","","9966993122","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(109,"Kampe Komaraiah","01/66",15000,"Pending","50 Bags Cement","9391383923","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(110,"Veeramalla Sathaiah","04/47",11000,"Pending","","9908220276","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(111,"S Venkatesh Goud","04/55",11000,"Pending","","9705343313","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(112,"K Bikshapathi Goud","04/53",11000,"Pending","","9949973687","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(113,"Raju Yadav","04/62",11000,"Pending","","9849396583","25/4/2024"));
        membershipDTOList.add(new MembershipDTO(114,"N Krishna Goud(Shekhar Goud)","03/36",11000,"Pending","","8179041737","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(115,"Prahalad Gujjar","03/39",11000,"Pending","","9392156861","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(116,"B Krishna(Sukkamma)","03/38",11000,"Pending","","7893758005","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(117,"Ravula Sai(Bikshapathi Goud)","02/17",11000,"Pending","","8801683656","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(118,"Nethi Ganesh","02/12",11000,"Pending","","8686602960","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(119,"P Chandrashekar","01/02",11000,"Pending","","9392567100","26/4/2024"));
        membershipDTOList.add(new MembershipDTO(120,"Anoju Narasimha Chary","10/220",20000,"Pending","25 Tulas Silver","8096839581","27/4/2024"));
        membershipDTOList.add(new MembershipDTO(121,"V Valaboju","9/173",11000,"Pending","","","27/4/2024"));
        membershipDTOList.add(new MembershipDTO(122,"E Bhaksar","19/496",15000,"Pending","50 Bags Cement","9347810461","27/4/2024"));
        membershipDTOList.add(new MembershipDTO(123,"Kandiganti Bikshapathi","1/67",15000,"Pending","50 Bags Cement","","27/4/2024"));
        membershipDTOList.add(new MembershipDTO(124,"Pagilla Ramesh","13/368",11000,"Pending","","9912773024","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(125,"Pabbu Yadagiri","13/367",11000,"Pending","","8790327737","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(126,"Andoju Raghavachary","13/374",11000,"Pending","","","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(127,"Kunde Mallesh Kuruma","13/358",11000,"Pending","","9700234823","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(128,"Pudugu Shekar Goud","15/383",11000,"Pending","","9392859522","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(129,"Kumire Srihari","15/402",11000,"Pending","","9393010615","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(130,"Nadhanoori Venkatesh","15/405",11000,"Pending","","9989701043","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(131,"Pasupuleti Pavan","15/406",11000,"Pending","","","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(132,"Tanneru Ramanaiah","15/400",11000,"Pending","","","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(133,"Alle Gopal","17/433",11000,"Pending","","9441334697","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(134,"Renikunta VenkatRaj","17/434",11000,"Pending","","9652119536","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(135,"Jarigilla Vinod kumar","17/438",11000,"Pending","","","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(136,"Chaliveru Venkatesh","17/441",11000,"Pending","","9542475904","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(137,"Challa Ganesh","17/445",11000,"Pending","","9959296892","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(138,"Nagole Anand Chary Praveen Chary","20/498",11000,"Pending","","9603161578","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(139,"Saamakura Ramulu, Saamakura Neelamma Venkatesh","20/498",11000,"Pending","","9949259791","28/4/2024"));
        membershipDTOList.add(new MembershipDTO(140,"Praveen Jha","21/540",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(141,"Baspana Mallesh","14/511",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(142,"Ragiri Dhanraj Goud","21/531",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(143,"Pabbu Shankar","21/528",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(144,"Pandiri Kranthi","21/524",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(145,"Orsu Ashkamma","21/525",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(146,"Kommigoni Narsimha","21/523",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(147,"Himalpuri Pushpawathi","21/520",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(148,"Veeramalla Lingaswamy","16/428",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(149,"Orsu Ramulu","21/518",11000,"Pending","","","30/4/2024"));
        membershipDTOList.add(new MembershipDTO(150,"Chengalva Swapna","21/516",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(151,"Rasthapuram Radhakrishna","11/268",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(152,"Chinthala Narsimhulu","24/633",11000,"Received","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(153,"Dhatri Ravikumar ","24/630",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(154,"Julu Buchaiah ","24/219",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(155,"Dugumarthi DrakshaRao","24/620",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(156,"Bandaru Saraiah Mahesh kumar","24/617",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(158,"G Raju","24/598",15000,"Pending","50 Bags Cement","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(159,"Rasamalla Jagadish","24/600",11000,"Pending","","","02/05/2024"));
        membershipDTOList.add(new MembershipDTO(160,"Jadhav Prashanth","11/428",11000,"Pending","","7306198686","03/05/2024"));
        membershipDTOList.add(new MembershipDTO(161,"Manchala Naveen kumar","22/551",11000,"Pending","","9553141384","03/05/2024"));
        membershipDTOList.add(new MembershipDTO(162,"Raghava Prasad Jaiswal","22/554",11000,"Pending","","","03/05/2024"));
        membershipDTOList.add(new MembershipDTO(163,"Kappera Ramachary","25/635",11000,"Pending","","6304930248","03/05/2024"));
        membershipDTOList.add(new MembershipDTO(164,"Madhela Sudhama","",11000,"Pending","","","03/05/2024"));
        membershipDTOList.add(new MembershipDTO(165,"Mainam Lingamma Ramesh(GHMC)","25/640",11000,"Pending","","9989300502","03/05/2024"));


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
        villageDonationsDTOS.add(new VillageDonationsDTO(13,"Sidhu kumar(Auto)","",1000,"Received"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(14,"Gundrathi Raman Goud","10/193",1000,"Received"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(15,"Namani Praveen Kumar","9/180",2222,"Pending"," ","9247329483"));
        villageDonationsDTOS.add(new VillageDonationsDTO(16,"Madhava","",2000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(17,"Badri Saalamma","9/168",1111,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(18,"H Gopal","11/242",5000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(19,"K Akshay","11/241",1116,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(20,"Dasadhi Vishal","11/290",1111,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(21,"S Raju(Dheeraj)","07/125",5000,"Pending"," ",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(22,"M Shyam Yadav","05/80",5000,"Pending"," ","9347252878"));
        villageDonationsDTOS.add(new VillageDonationsDTO(23,"Vijay","03/33",5000,"Pending"," ","9121866217"));
        villageDonationsDTOS.add(new VillageDonationsDTO(24,"Nadigadda Raju","Cutting Shop",4500,"Pending"," 15 Bags Cement",""));
        villageDonationsDTOS.add(new VillageDonationsDTO(25,"Dundigal Venkatesh","501",5000,"Pending"," ",""));
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
        expensesList.add(new ExpensesDTO(19,"15/4/24","Pooja Day Construction Material",2850,"trolley sand,cement and bricks","","",""));
        expensesList.add(new ExpensesDTO(20,"15/4/24","Curd",50,"","","",""));
        expensesList.add(new ExpensesDTO(21,"22/4/24","Murali",10000,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(22,"20/4/24","Sai builder",50000,"","","",""));
        expensesList.add(new ExpensesDTO(23,"01/4/24","Cooli Expenses",800,"","","",""));
        expensesList.add(new ExpensesDTO(24,"01/4/24","Motor Fitting Charges",790,"","","",""));
        expensesList.add(new ExpensesDTO(25,"27/4/24","Tiffin",180,"","","",""));
        expensesList.add(new ExpensesDTO(26,"28/4/24","Motor(Ambuja)",28500,"","","",""));
        expensesList.add(new ExpensesDTO(27,"28/4/24","Bricks",112200," 10,200 bricks","","",""));
        expensesList.add(new ExpensesDTO(28,"28/4/24","Lock",100," Shilpi Room","Jagan","Shop Owner","Rajesh/Murali"));
        expensesList.add(new ExpensesDTO(29,"05/05/2024","Pooja Samgri and Tiffins",390,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(30,"05/05/2024","Shilpi Katnam",501,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(31,"05/05/2024","To Shilpi",10000,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(32,"06/05/2024","Green Mat",2300,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(33,"06/05/2024","firewood & Auto",2700,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(34,"06/05/2024","Cement Labour",600,"","Krishna","",""));
        expensesList.add(new ExpensesDTO(35,"06/05/2024","Rampam",150,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(36,"06/05/2024","Cement Cover",1000,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(37,"09/05/2024","To Shilpi",1500,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(38,"10/05/2024","To Shilpi",1000,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(39,"11/05/2024","To Shilpi",57500,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(40,"11/05/2024","Marker + Thread",90,"","Jagan","",""));
        expensesList.add(new ExpensesDTO(41,"11/05/2024","To Krishna",21500,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(42,"30/04/2024","To Contractor",100000,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(43,"14/05/2024","Thadakalu",4300,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(44,"14/05/2024","Gampalu, Bindhelu",1285,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(45,"14/05/2024","To Contractor",33500,"","Chinna(13040)/Jagan(20460)","",""));
        expensesList.add(new ExpensesDTO(46,"14/05/2024","To Contractor",100000,"","Chinna","",""));
        expensesList.add(new ExpensesDTO(47,"14/05/2024","To Borewell",54000,"","Srikanth","",""));
        expensesRepo.saveAll(expensesList);
    }

    @PostConstruct
    public void loadAmountDetails(){

        List<AmountReceivedDTO> amountReceivedDTOS = new ArrayList<>();

        amountReceivedDTOS.add(new AmountReceivedDTO(1,"Temple Initial Amount",500000,"","Temple Committe",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(2,"Bandra Suguna(Srinivas, Srikanth)",54000,"","Srikanth",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(3,"Bangara Srinivas Goud",5000,"","Srikanth",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(4,"Maroju Govardhana Chary",2001,"","Jagan",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(5,"P Narender Goud",1116,"","Jagan",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(6,"Sidhu kumar(Auto)",1000,"","PadmaRao",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(7,"Gundrathi Raman Goud",1000,"","Jagan",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(8,"Deva Narayana Sharma",11011,"","Jagan",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(9,"Edure Ramulu(Current Ramulu)",11000,"","Krishna",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(10,"CH Jangaiah Goud",27000,"","Murali",""));
        amountReceivedDTOS.add(new AmountReceivedDTO(11,"Vallapu Raju Chary",11000,"","Jagan","24/04/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(12,"Parvathamma",5000,"","Chinna","21/04/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(13,"Kasetti Krishna",11111,"","Chinna","21/04/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(14,"Somaraju Yadaiah",11000,"","Krishna","29/04/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(15,"Dasadhi Anil Nayi",11000,"","Jagan","01/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(16,"Chintala Venugopal",11000,"","Krishna","01/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(17,"Baddam Ravinder Goud",50002,"","Jagan","06/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(18,"Macharla Kumar Goud",11000,"","Murali","06/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(19,"Cheruku Chiranjeevi Goud",0,"100 Bags Cement","Krishna","06/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(20,"Vasireddy Bharath",11000,"","Murali","14/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(21,"Sravanthi",500,"","Murali","14/05/2024"));
        amountReceivedDTOS.add(new AmountReceivedDTO(22,"Satish kuruma",10000,"","Chinna","14/05/2024"));
        amountReceivedRepo.saveAll(amountReceivedDTOS);
    }
    @PostConstruct
    public void templeAccountDetails(){

        List<TempleAmountDetailsDTO> templeAmountDetailsDTO =  new ArrayList<>();

        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(1,"Temple Bank Account",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(2,"Chinna",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(3,"Krishna",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(4,"Murali",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(5,"Padma Rao",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(6,"Srikanth",0));
        templeAmountDetailsDTO.add(new TempleAmountDetailsDTO(7,"Jagan",79629));

        templeAmountDetailsRepo.saveAll(templeAmountDetailsDTO);
    }




}

