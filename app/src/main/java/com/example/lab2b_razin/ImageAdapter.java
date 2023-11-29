package com.example.lab2b_razin;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private final Context mContext;

    public Integer[] thumbImages ={
            R.drawable.akyuu, R.drawable.alice, R.drawable.alice98, R.drawable.aya,
            R.drawable.aya2, R.drawable.byakuren, R.drawable.chen, R.drawable.chiyuri,
            R.drawable.cirno, R.drawable.daiyousei, R.drawable.eiki, R.drawable.eirin,
            R.drawable.elis, R.drawable.ellen, R.drawable.elly, R.drawable.flandre,
            R.drawable.gengetsu, R.drawable.gyoku, R.drawable.hina, R.drawable.ichirin,
            R.drawable.iku, R.drawable.kaguya, R.drawable.kana, R.drawable.kanako,
            R.drawable.keine, R.drawable.keineb, R.drawable.kisume, R.drawable.koakuma,
            R.drawable.kogasa, R.drawable.koishi, R.drawable.komachi, R.drawable.konngara,
            R.drawable.kotohime, R.drawable.kurumi, R.drawable.letty, R.drawable.lily,
            R.drawable.lilyb, R.drawable.luize, R.drawable.luna, R.drawable.lunasa,
            R.drawable.lyrica, R.drawable.mai, R.drawable.maribel, R.drawable.marisa,
            R.drawable.marisa98, R.drawable.marisa982, R.drawable.medicine, R.drawable.meiling,
            R.drawable.meira, R.drawable.merlin, R.drawable.mima, R.drawable.minoriko,
            R.drawable.mokou, R.drawable.momiji, R.drawable.mugetsu, R.drawable.murasa,
            R.drawable.mystia, R.drawable.nazrin, R.drawable.nitori, R.drawable.nue,
            R.drawable.okuu, R.drawable.orange, R.drawable.orin, R.drawable.parsee,
            R.drawable.patchouli, R.drawable.ran, R.drawable.reimu, R.drawable.reimu98,
            R.drawable.reisen, R.drawable.reisen2, R.drawable.remilia, R.drawable.renko,
            R.drawable.rika, R.drawable.rikako, R.drawable.rinnosuke, R.drawable.rumia,
            R.drawable.ruukoto, R.drawable.sakuya, R.drawable.sanae, R.drawable.sara,
            R.drawable.sariel, R.drawable.satori, R.drawable.shin, R.drawable.shinki,
            R.drawable.shizuha, R.drawable.shou, R.drawable.sigma, R.drawable.star,
            R.drawable.suika, R.drawable.sunny, R.drawable.suwako, R.drawable.tenshi,
            R.drawable.tewi, R.drawable.tokiko, R.drawable.toyohime, R.drawable.wriggle,
            R.drawable.yamame, R.drawable.yorihime, R.drawable.youki, R.drawable.youmu,
            R.drawable.yukari, R.drawable.yuki, R.drawable.yumeko, R.drawable.yumemi,
            R.drawable.yuugi, R.drawable.yuuka, R.drawable.yuuka98, R.drawable.yuuka98s,
            R.drawable.yuyuko
    };

    public ImageAdapter(Context c){mContext = c;}

    @Override
    public int getCount(){return thumbImages.length;}

    @Override
    public Object getItem(int position) {return thumbImages[position];}

    @Override
    public long getItemId(int position) {return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
