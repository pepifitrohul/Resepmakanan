package com.example.pep.warpep1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by pepi on 10/5/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final Context context;
    String [] resep={"1.1 ekor ayam\n 2.Gula pasir sebanyak ¼ dst\n 3.Garam sebanyak 5 sdt\n 4.Minyak wijen sebanyak 1 sdm\n 5.Jahe sebesar 3 ruas jari kemudian dimemarkan\n 6.Daun bawang sebanyak 1 tangkai diiris kecil\n 7.Air sebanyak 1,5 liter"
            ,"1.1 ¼ ekor ayam pejantan\n 2.4 jempol lengkuas, geprek\n 3.8 siung bawang putih, geprek\n 4.3 sdm gula merah, sisir halus\n 5.5 lembar daun salam\n 6.2 sereh\n 7.1 ½ liter air kelapa\n 8.garam, gula dan lada halus sebagai penyedap rasa\n"
            ,"1.1 ayam yang gemuk dan muda\n 2.25 gram kemiri\n 3.50 gram bawang merah\n 4.3 siung bawang putih\n 5.1 ibu jari lengkuas muda\n 6.1 ruas kunyit\n 7.2 batang sereh bagian putihnya\n 8.1 sdm garam\n 9.1 gelas air\n 10.minyak untuk menggoreng"
            ,"1.1 ekor ayam atau seputar 1 kilogram\n 2.Minyak untuk menumis secukupnya\n 3.Daun salam 2 lembar\n 4.Batang serai 1 buah yang telah dimemarkan\n 5.Lengkuas 1 cm yang telah dimemarkan pula\n 6.Kayu manis 4 cm\n 7.Santan 750 cc dari 1 butir kelapa"
            ,"1.1 ekor ayam kampung. Ayam ini perlu dibersihkan terlebih dahulu kemudian di potong-potong sesuai selera. Ayam kampung rasanya lebih sedap dan lebih gurih dibandingkan ayam potong sehingga lebih cocok untuk dibuat menjadi ayam pop\n 2.2 lembar daun jeruk. Bagian urat daun jeruk yang berada persis di bagian tengah daun dibuang sehingga aroma daun jeruk akan lebih keluar\n 3.2 lembar daun salam\n 4.2 batang serai. Batang serai ini kemudian digeprek untuk lebih mengeluarkan rasa dan aromanya\n 5.600 ml air kelapa"
            ,"1.Bahan utamanya adalah ayam potong segar ukuran 1 kilogram. Potong ayam menjadi 8 atau sesuai selera.\n 2.Garam halus secukupnya sesuai selera atau kurang lebih 0.5 sendok kecil saja.\n 3.Bawang putih bubuk kurang lebih sebanyak 1 sendok kecil saja.\n 4.Lada halus sedikit saja atau kurang lebih 1 sendok kecil juga.\n 5.Bubuk cabai secukupnya kalau suka. Bisa dihilangkan kalau tidak suka.\n 6.Minyak goreng baru secukupnya.\n"
            };
    String[] procedur={"1.Olah Tumis jahe dan bawang putih terlebih dahulu sampai wangi. Kemudian aduk beras bersama dengan tumisan jahe dan bawang. Setelah itu masukkan kaldu ayam serta garam lalu kukus hingga matang selama 20 menit.\n 2.Sekarang siapkan ayamnya. Siapkan campuran untuk melumuri ayam yang terbuat dari minyak wijen, jahe serta garam. Campuran tersebut kamu aduk hingga merata setelah itu didiamkan sekitar setengah jam. Siapkan daun bawang, jahe, serta garam dan masukkan ke dalam ruang rongga ayam secara perlahan. Lalu rebus ayam tadi ke dalam air yang sudah diracik dengan garam dan gula. Masak hingga 20 – 25 menit.\n 3.Sekarang waktunya menyiapkan kuahnya, Ada banyak pilihan tapi salah satu pilihannya disini kamu bisa menggunakan air rebusan ayam hainan yang dicampur dengan labu siam serta merica. Masaklah hingga labu siam menjadi empuk.\n 4.Nasi ayam hainan khas singapore tidak akan lengkap jika tanpa saus jahe. Cara membuatnya sangat mudah, yaitu dengan menumis jahe terlebih dahulu kemudian mencampurnya dengan kaldu. Setelah itu masukkan kecap ikan dan masak sampai rata.",
            "1.Bersihkan daging ayam dan cuci bersih. Lumuri dengan air perasan jeruk nipis dan garam. Lumuri juga dengan bumbu yang dihaluskan sambil agak diremas-remas. Diamkan beberapa saat.\n 2.Rebus daging ayam dalam santan, tambahkan daun salam, daun jeruk dan serai. Tutup panci dan rebus ayam hingga matang dan santan menyusut.\n 3.Angkat ayam dan tiriskan.\n 4.Panaskan minyak, goreng ayam hingga matang dan berwarna kuning kecoklatan. Angkat.\n 5.Membuat sambal, goreng semua bahan sambal mentah. Haluskan semua bahan dan goreng lagi bersama dengan sedikit kaldu sisa rebusan ayam",
            "1.Ayam setelah dibersihkan dipotong-potong.\n 2.Bahan-bahan untuk bumbu digerus, bubuhi 1 gelas air, ratakan lalu tuangkan ke ayam yang sudah ditaruh di wajan.\n 3.Tutup wajannya lalu masak sambil kadang-kadang diaduk sampai airnya habis, angkat lalu goreng dengan banyak minyak.\n 4.Jika sudah kering, angkat dengan serok yang halus agar endapannya tidak keluar. Endapan ini enak dan gurih sekali untuk teman nasi.",
            "1.Langkah pertama dalam resep opor ayam khusus yaitu dengan bersihkan ayam terlebih dulu serta potong jadi 10 sisi yang lalu digoreng dalam minyak yang panas sampai berwarna kekuningan.\n 2.Langkah Kedua Panaskan 3 sendok makan minyak goreng serta masukkan seluruhnya bumbu yang telah dihaluskan jadi satu kedalam wajan itu. Tumis sambil diaduk selalu. Masukkan serai, lengkuas\n serta kayu manis kedalamnya.\n 3.Langkah ketiga Sesudah aromanya mulai merasa keluar, masukkan santan yang disusul dengan ayam yang tadi sudah digoreng. Masak sampai santan mendidih serta ayam juga jadi empuk.\n 4.Langkah Keempat Sesudah di rasa masak, angkat dari atas kompor serta hidangkan dengan lontong serta ketupat. kelar sudah Resep opor ayam khusus lebaran nih.",
            "1.Untuk menghilangkan bau amis pada ayam kampung, lumuri terlebih dahulu dengan air jeruk nipis selama kurang lebih 15 menit\n 2.Cuci dan bersihkan ayam, kemudian lumuri dengan bumbu halus dan biarkan selama 1 jam agar bumbu meresap hingga ke dalam\n 3.Siapkan sebuah panci atau wajan berukuran cukup besar yang bisa menampung ayam tersebut.\n 4.Masukkan air kelapa, daun jeruk, daun salam, serai, jahe, lengkuas, garam, kaldu bubuk atau penyedap dan tidak lupa pula ayam yang telah dilumuri bumbu halus tadi.\n 5.Ayam beserta bumbu-bumbu ini kemudian dimasak hingga bumbu benar-benar menyerap serta air rebusan hampir habis. Setelah air rebusan mengering, matikan api, keluarkan ayam dari dalam panci kemudian tiriskan",
            "1.Bahan utamanya adalah ayam potong segar ukuran 1 kilogram. Potong ayam menjadi 8 atau sesuai selera.\n 2.Garam halus secukupnya sesuai selera atau kurang lebih 0.5 sendok kecil saja.\n 3.Bawang putih bubuk kurang lebih sebanyak 1 sendok kecil saja.\n 4.Lada halus sedikit saja atau kurang lebih 1 sendok kecil juga.\n 5.Bubuk cabai secukupnya kalau suka. Bisa dihilangkan kalau tidak suka.\n 6.Minyak goreng baru secukupnya."};
    String [] name={"Ayam Goreng Hainan","Ayam Goreng Kalasan","Ayam Bandung","Ayam Opor","Ayam Pop","Ayam Goreng Tepung"};
    String [] deskripsi={"Ayam Goreng Hainan Enak Lezat","Ayam Goreng Kalasan Enak Lezat","Ayam Bandung Enak Lezat","Ayam Opor Enak Lezat","Ayam Pop Enak Lezat","Ayam Goreng Tepung Lezat" };
    Integer [] gambar={R.drawable.hainan,R.drawable.kalasan,R.drawable.bandung,R.drawable.opor,R.drawable.pop,R.drawable.tepung};
    // menampilkan list item dalam bentuk text dengan tipe data string dengan variable name
    LayoutInflater inflater;
    public RecyclerAdapter(Context context) {
        this.context=context;
        inflater=LayoutInflater.from(context);
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v=inflater.inflate(R.layout.tampilanrecycle, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.tv2.setText(deskripsi[position]);
        holder.tv2.setOnClickListener(clickListener);


        holder.tv1.setTag(holder);
        holder.tv2.setTag(holder);


    }

    View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Bundle b = new Bundle();


            b.putInt("gambar",gambar[position]);
            b.putString("label","Resep "+name[position]);
            b.putString("resep",resep[position]);
            b.putString("procedur",procedur[position]);

            Intent intent = new Intent(context , TampilanDetil.class);
            intent.putExtras(b);
            context.startActivity(intent);




        }
    };



    @Override
    public int getItemCount() {
        return name.length;
    }

}
