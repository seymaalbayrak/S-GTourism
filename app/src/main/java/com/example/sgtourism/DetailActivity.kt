package com.example.sgtourism

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    private lateinit var cityName : String
    private lateinit var image : ImageView
    private lateinit var text : TextView
    private lateinit var image2 : ImageView
    private lateinit var text2 : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        cityName = ""
        image = findViewById(R.id.detailImageView)
        text = findViewById(R.id.detailTextView)
        image2 = findViewById(R.id.detailImageView2)
        text2 = findViewById(R.id.detailTextView2)
        if (intent.hasExtra("cityname")) {
            cityName = intent.getStringExtra("cityname")!!
        }

        if(cityName.equals("Kapadokya")) {
            image.setBackgroundResource(R.drawable.kapadokya)
            text.setText("Nevşehir is a city located in central Turkey, and its history dates back to ancient times. The region was once inhabited by Hittites, one of the oldest civilizations in Anatolia, and later by Persians, Greeks, Romans, and Byzantines.\n" +
                    "During the Seljuk period, Nevşehir became an important center of trade and culture, and many beautiful mosques, caravanserais, and madrasas were built in the city. In the Ottoman period, it continued to thrive, and many impressive public buildings and houses were constructed.\n" +
                    "Nevşehir is also known for its unique underground cities, which were built by early Christians to protect themselves from persecution. These cities, including Derinkuyu and Kaymakli, are carved out of soft volcanic rock and contain a maze of tunnels, chambers, and ventilation shafts.\n" +
                    "\n" +
                    "You should visit:\n"+
            "Cappadocia")

            image2.setBackgroundResource(R.drawable.kapadokyadetail)

            text2.setText("Cappadocia is a region in central Turkey known for its unique geological formations and cultural heritage. Its history dates back to ancient times, with evidence of human settlement dating back to the Paleolithic era.\n" +
                    "Over the centuries, Cappadocia was inhabited by various civilizations, including the Hittites, Persians, Greeks, Romans, Byzantines, Seljuks, and Ottomans. Each of these civilizations left their mark on the region, building magnificent cities, churches, and monasteries, as well as carving out underground cities and dwellings from the soft volcanic rock.\n" +
                    "During the early Christian period, Cappadocia became an important center of Christianity, with many Christians fleeing there to escape persecution. They carved out underground cities, churches, and monasteries, creating a unique subterranean world that still exists today.\n" +
                    "\n" +
                    "And also best places of Nevşehir:\n" +
                    "1. Zelve Açık Hava Müzesi \n" +
                    "2. Kızıl Vadi \n" +
                    "3. Kaymaklı \n" +
                    "4. Özkonak Yeraltı Şehri \n" +
                    "5. Hacı Bektaş Veli Müzesi \n" +
                    "\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tTesti Kebabı \n" +
                    "\uF0FC\tKabak Çekirdekli Erişte\n" +
                    "\uF0FC\tYaprak Sarma\n" +
                    "\uF0FC\tÜrgüp Köfte\n" +
                    "\uF0FC\tKayseri & Nevşehir Mantıları\n" +
                    "\uF0FC\tDüğün Çorbası\n" +
                    "\uF0FC\tKuru Kaymak\n" +
                    "\n" +
                    "Best time to visit:\n" +
                    "May, June, September, October\n")
        }
        if(cityName.equals("Antep")) {
            image.setBackgroundResource(R.drawable.antep)
            text.setText("The sixth-largest city in Turkey and the largest city in Southeastern Anatolia. Gaziantep's geopolitical position at the intersection of Mesopotamia and the Mediterranean has led to its hosting a number of civilizations, including the Hittite, Mitanni, Assyria, Persian, Seleucids, Roman, Byzantine, Seljuk, Mameluke, Dulkadir, and Ottoman empires. Gaziantep is known for its significant cultural works, including a variety of historical artifacts from different periods, such as the Paleolithic, Neolithic, Chalcolithic, Bronze, Iron Age, and Late-Hittite. The city became a center of commerce and culture due to its location on the historical Silk Road. Despite a period of decline during the Ottoman Empire, the city developed socially, economically, and commercially after becoming the administrative district of Halep temporarily in 1818-1819. The city played a significant role in the Antep War, during which it fought off British and French invaders for 10 months and nine days and was awarded the title of \"Ghazi\" in 1921. After gaining independence from the invaders, Gaziantep continued to develop and is now known for its cultural values, cuisine, organized industrial regions, and intercity and international transportation links.\n" +
                    "(1 tane tarihi yer)\n" +
                    "Gaziantep Castle\n")

            image2.setBackgroundResource(R.drawable.antepkale)

            text2.setText("Gaziantep Castle is a historic fortress located in Gaziantep, Turkey. The castle dates back to the Roman period and has been used by various civilizations over the centuries, including the Byzantines, Seljuks, Mamluks, and Ottomans.\n" +
                    "The castle was originally built for defensive purposes and played an important role in the region's military history. It was strategically located on a hill overlooking the city, providing a vantage point for spotting enemy movements and launching attacks.\n" +
                    "Over time, the castle was expanded and renovated by various rulers, adding new features and fortifications. During the Ottoman period, it was used as a military barracks and later as a prison.\n" +
                    "\n" +
                    "And also best places of Gaziantep:\n" +
                    "1- Zeugma Mozaik Müzesi.\n" +
                    "2- Şahinbey Milli Mücadele Müzesi.\n" +
                    "3- Rumkale.\n" +
                    "4- Gaziantep Kalesi.\n" +
                    "5- Bakırcılar Çarşısı\n" +
                    "6- Yaşayan Müze Tarihi Gümrük Hanı\n" +
                    "7- Hamam Müzesi\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tFındık Lahmacun \n" +
                    "\uF0FC\tBayram Yuvarlaması \n" +
                    "\uF0FC\tFıstıklı Baklava\n" +
                    "\uF0FC\tKatmer\n" +
                    "\uF0FC\tAli Nazik \n" +
                    "Best time to visit:\n" +
                    "October, November, December\n")
        }
        if(cityName.equals("İstanbul")) {
            image.setBackgroundResource(R.drawable.istanbul)
            text.setText("Istanbul dates back thousands of years. The city was originally established by the Thracian tribe of Lygos, but was later renamed Byzantium and became a major center of trade and culture under the Byzantine Empire. In 324 CE, it was renamed Constantinople by the Roman Emperor Constantine the Great and became the capital of the Roman Empire. After being conquered by the Ottoman Turks in 1453, it was renamed Istanbul and became the capital of the Ottoman Empire. Following the dissolution of the Ottoman Empire after World War I, Istanbul became part of the new Turkish Republic, established by Mustafa Kemal Atatürk in 1923. Today, Istanbul is the largest city in Turkey and a major cultural, economic, and political center, with a rich history and vibrant culture.\n" +
                    "\n" +
                    "You should visit:\n" +
                    "Galata Tower\n")

            image2.setBackgroundResource(R.drawable.istdetail)

            text2.setText("Galata Tower is a historic tower located in Istanbul, Turkey. The tower was built by the Genoese in the 14th century as part of the fortifications surrounding their colony in Constantinople (now Istanbul). It is 67 meters tall and has nine stories, with a panoramic view of the city from the top.\n" +
                    "Over the centuries, the tower has had many uses, including as a lookout point, fire tower, and even a prison. During the Ottoman period, the tower was used as an observatory for astronomy and later as a place for storing the archives of the navy.\n" +
                    "\n" +
                    "And also best places of İstanbul:\n" +
                    "1- Ayasofya Camii\n" +
                    "2- Yerebatan Sarnıcı\n" +
                    "3- Topkapı Sarayı\n" +
                    "4- Sultanahmet Meydanı\n" +
                    "5- Dolmabahçe Sarayı\n" +
                    "6- Kız Kulesi\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tSultanahmet-Köfte\n" +
                    "\uF0FC\tOrtaköy-Kumpir\n" +
                    "\uF0FC\tSarıyer-Börek\n" +
                    "\uF0FC\tEminönü-Balık Ekmek\n" +
                    "\uF0FC\tSüleymaniye-Kuru Fasulye\n" +
                    "\uF0FC\tVefa-Boza\n" +
                    "\uF0FC\tKanlıca-Yoğurt\n" +
                    "Best time to visit:\n" +
                    "May, September\n")
        }
        if(cityName.equals("İzmir")) {
            image.setBackgroundResource(R.drawable.izmir)
            text.setText("Izmir is a coastal city in western Turkey with a rich history dating back to ancient times. The city has been inhabited by various civilizations, including the Greeks, Romans, Byzantines, and Ottomans.\n" +
                    "In the 8th century BC, the city was founded by the Greeks and became an important center of trade and culture. During the Roman period, it was known as Smyrna and continued to flourish as a cultural and commercial hub.\n" +
                    "In the Byzantine era, Izmir was an important center of Christianity and was the site of several important religious councils. The city was later ruled by the Ottomans, who transformed it into a major commercial center.\n" +
                    "You should visit:\n" +
                    "Ephesus ancient city\n")

            image2.setBackgroundResource(R.drawable.izmirdetail)

            text2.setText("Ephesus was an ancient city in western Turkey that was founded by the Greeks in the 10th century BC. It was an important center of trade, culture, and religion throughout its history, and was home to one of the Seven Wonders of the Ancient World, the Temple of Artemis.\n" +
                    "During the Roman period, Ephesus became one of the largest cities in the Mediterranean and was an important center of early Christianity. The city was visited by St. Paul, who wrote several letters to the early Christian community in Ephesus.\n" +
                    "In the 4th century AD, the city was largely destroyed by an earthquake and was gradually abandoned over the centuries. Today, the ruins of Ephesus are a popular tourist destination and a UNESCO World Heritage Site, attracting visitors from around the world who come to see the well-preserved remains of ancient streets, buildings, and monuments, including the famous Library of Celsus and the Great Theater.\n" +
                    "And also best places of izmir:\n" +
                    "1. Alsancak \n" +
                    "2. Kordon Boyu \n" +
                    "3. Kemeraltı Çarşısı \n" +
                    "4. Saat Kulesi \n" +
                    "5. Tarihi Asansör \n" +
                    "6. İzmir Doğal Yaşam Parkı\n" +
                    "\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tEtli Ekmek Dolması\n" +
                    "\uF0FC\tİzmir Köfte\n" +
                    "\uF0FC\tBoyoz\n" +
                    "\uF0FC\tPatlıcanlı Silkme.\n" +
                    "\uF0FC\tSütlü Dilbalığı\n" +
                    "\uF0FC\tİzmir Lokması\n" +
                    "\uF0FC\tİzmir Bombası\n" +
                    "Best time to visit:\n" +
                    "July, August, September\n")
        }
        if(cityName.equals("Trabzon")) {
            image.setBackgroundResource(R.drawable.trabzon)
            text.setText("Trabzon is a city located on the Black Sea coast of northeastern Turkey. The city has a rich and varied history that dates back to ancient times. The region was inhabited by various peoples, including the Greeks, Persians, and Romans, before becoming part of the Byzantine Empire in the 4th century. During the Byzantine era, Trabzon became an important center of commerce and culture, and many magnificent churches and monasteries were built in the city.\n" +
                    "In the 13th century, Trabzon became the capital of the Empire of Trebizond, a successor state to the Byzantine Empire. The city flourished under the rule of the Komnenos dynasty, and many impressive palaces, churches, and monasteries were built during this period.\n" +
                    "Trabzon was later conquered by the Ottoman Empire in the 15th century and became an important center of trade and commerce. The city continued to grow and develop under Ottoman rule, and many mosques, hamams, and other public buildings were constructed.\n" +
                    "\n" +
                    "You should visit:\n" +
                    "Sümela Monastery\n")

            image2.setBackgroundResource(R.drawable.trabzondetail)

            text2.setText("Sümela Monastery, also known as the Monastery of Virgin Mary, is a Greek Orthodox monastery located in the Altindere National Park in the Maçka district of Trabzon, Turkey. The monastery was built in the 4th century by Greek Orthodox monks who fled persecution in Athens and dedicated it to the Virgin Mary.\n" +
                    "Over the centuries, the monastery underwent several renovations and additions, with the most significant ones carried out during the 13th and 14th centuries, during the reign of the Komnenos dynasty. The monastery became a popular destination for pilgrims, and it was renowned for its magnificent frescoes and icons.\n" +
                    "In 1923, the Treaty of Lausanne was signed, which resulted in the forced exchange of populations between Greece and Turkey. As a result, the Greek population of Trabzon, including the monks of Sümela Monastery, were deported to Greece, and the monastery was abandoned.\n" +
                    "\n" +
                    "And also best places of Trabzon:\n" +
                    "1. Uzungöl \n" +
                    "2. Atatürk Köşkü \n" +
                    "3. Boztepe \n" +
                    "4. Trabzon Ayasofya Müzesi\n" +
                    "5. Zağnos Vadisi\n" +
                    "6. Ortahisar\n" +
                    "\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tKaralahana Dolması\n" +
                    "\uF0FC\tPazılı Kaygana\n" +
                    "\uF0FC\tMuhlama \n" +
                    "\uF0FC\tMısır Ekmeği\n" +
                    "\uF0FC\tKaradeniz Pidesi\n" +
                    "\uF0FC\tLaz Böreği.\n" +
                    "\uF0FC\tHamsiköy Sütlacı\n" +
                    "\uF0FC\tAkçaabat Köfte\n" +
                    "\n" +
                    "Best time to visit:\n" +
                    "June, July, August\n")
        }
        if(cityName.equals("Bodrum")) {
            image.setBackgroundResource(R.drawable.bodrum)
            text.setText("Bodrum is a coastal city in southwestern Turkey that has a rich and varied history. The city was founded by the ancient Greeks in the 7th century BCE and was known as Halicarnassus.\n" +
                    "In ancient times, Halicarnassus was an important center of commerce and culture, and many impressive structures were built in the city, including the Mausoleum of Mausolus, which was one of the Seven Wonders of the Ancient World.\n" +
                    "Halicarnassus later came under the control of the Roman Empire and the Byzantine Empire before being conquered by the Seljuk Turks in the 12th century. The city was then captured by the Knights Hospitaller in the 15th century and became known as Petronium.\n" +
                    "In the 16th century, Petronium was conquered by the Ottoman Empire, and the city continued to develop and flourish. Many impressive structures were built during this time, including the Bodrum Castle, which was constructed in the early 1400s and is now a major tourist attraction.\n" +
                    "\n" +
                    "You should visit:\n" +
                    "Bodrum Underwater Archeology Museum\n")

            image2.setBackgroundResource(R.drawable.bodrumdetail)

            text2.setText("The Bodrum Underwater Archaeology Museum is located in the Bodrum Castle and is one of the most important museums of its kind in the world. The museum is dedicated to the underwater archaeological heritage of the Aegean and Mediterranean regions.\n" +
                    "The museum's collection includes a wide variety of artifacts recovered from shipwrecks dating back to ancient times, as well as items from various civilizations that have inhabited the region throughout history. Visitors can see exhibits ranging from ancient amphorae and pottery to ancient coins and jewelry.\n" +
                    "The museum also includes a display of ancient shipwrecks that have been excavated from the waters around Bodrum. The most famous of these is the Uluburun Shipwreck, which was discovered in 1982 and is thought to date back to the Late Bronze Age.\n" +
                    "\n" +
                    "And also best places of Bodrum:\n" +
                    "1. Bodrum Kalesi \n" +
                    "2. Bardakçı Koyu\n" +
                    "3. Zeki Müren Sanat Müzesi \n" +
                    "4. Bodrum Anfi Tiyatrosu\n" +
                    "5. Bitez Plajı\n" +
                    "\n" +
                    "When you go there, you should definitely taste:\n" +
                    "\uF0FC\tKabak Çiçeği Dolması\n" +
                    "\uF0FC\tBodrum Çökertmesi.\n" +
                    "\uF0FC\tDeniz Börülcesi\n" +
                    "\uF0FC\tSarmaşık Kavurması\n" +
                    "\uF0FC\tTurp Otu Salatası\n" +
                    "\uF0FC\tBamya\n" +
                    "\uF0FC\tHardal Otu Salatası\n" +
                    "\n" +
                    "Best time to visit:\n" +
                    "July, August, September\n")
        }
    }
}