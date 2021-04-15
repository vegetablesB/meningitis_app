package com.example.meningitis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Arrays;

public class InputActivity extends AppCompatActivity {

    double [] inputdata = new double[52];
    private Button btn_fever;
    private Boolean b_btn_fever = false;
    private Button btn_headache;
    private Boolean b_btn_headache = false;
    private Button btn_nausea;
    private Boolean b_btn_nausea = false;
    private Button btn_emesis;
    private Boolean b_btn_emesis = false;
    private Button btn_sweat;
    private Boolean b_btn_sweat = false;
    private Button btn_cough;
    private Boolean b_btn_cough = false;
    private Button btn_fussiness;
    private Boolean b_btn_fussiness = false;
    private Button btn_rash;
    private Boolean b_btn_rash = false;
    private Button btn_epilepsy;
    private Boolean b_btn_epilepsy = false;
    private Button btn_weight;
    private Boolean b_btn_weight = false;
    private Button btn_flu;
    private Boolean b_btn_flu = false;
    private Button btn_tympanitis;
    private Boolean b_btn_tympanitis = false;
    private Button btn_gastroenteritis;
    private Boolean b_btn_gastroenteritis = false;
    private Button btn_herpes;
    private Boolean b_btn_herpes = false;
    private Button btn_aids;
    private Boolean b_btn_aids = false;
    private Button btn_epidemic_area;
    private Boolean b_btn_epidemic_area = false;
    private Button btn_suppurative_infections;
    private Boolean b_btn_suppurative_infections = false;
    private Button btn_bird;
    private Boolean b_btn_bird = false;
    private Button btn_cerebral_trauma;
    private Boolean b_btn_cerebral_trauma = false;
    private Button btn_immune;
    private Boolean b_btn_immune = false;
    private Button btn_tuberculosis;
    private Boolean b_btn_tuberculosis = false;
    private Button btn_consciousness;
    private Boolean b_btn_consciousness = false;
    private Button btn_pathological;
    private Boolean b_btn_pathological = false;
    private Button btn_meningeal;
    private Boolean b_btn_meningeal = false;
    private Button btn_optic;
    private Boolean b_btn_optic = false;
    private Button btn_cranial;
    private Boolean b_btn_cranial = false;
    private Button btn_cognitive;
    private Boolean b_btn_cognitive = false;
    private Button btn_focal;
    private Boolean b_btn_focal = false;
    private Button btn_done;
    private EditText edit_age;
    private EditText edit_time;
    private EditText edit_temperature;
    private EditText edit_pressure;
    private EditText edit_leucocyte;
    private EditText edit_monor;
    private EditText edit_lymphocyte_proportion;
    private EditText edit_neutrophils_proportion;
    private EditText edit_CFP;
    private EditText edit_CFG;
    private EditText edit_blood_sugar;
    private EditText edit_LgG;
    private EditText edit_LgA;
    private EditText edit_LgM;
    private EditText edit_ESR;
    private RadioGroup radioGroup;
    private RadioButton Rb;
    private RadioGroup radioGroup2;
    private RadioButton Rb2;
    private EditText edit_CFG_blood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        edit_age=findViewById(R.id.edit_age);
        edit_time=findViewById(R.id.edit_time);
        edit_temperature=findViewById(R.id.edit_temperature);
        edit_pressure=findViewById(R.id.edit_pressure);
        edit_leucocyte=findViewById(R.id.edit_leucocyte);
        edit_monor=findViewById(R.id.edit_monor);
        edit_lymphocyte_proportion=findViewById(R.id.edit_lymphocyte_proportion);
        edit_neutrophils_proportion=findViewById(R.id.edit_neutrophils_proportion);
        edit_CFP=findViewById(R.id.edit_CFP);
        edit_CFG=findViewById(R.id.edit_CFG);
        edit_blood_sugar=findViewById(R.id.edit_blood_sugar);
        edit_LgG=findViewById(R.id.edit_LgG);
        edit_LgA=findViewById(R.id.edit_LgA);
        edit_LgM=findViewById(R.id.edit_LgM);
        edit_ESR=findViewById(R.id.edit_ESR);
        edit_CFG_blood=findViewById(R.id.edit_CFG_blood);
        radioGroup=findViewById(R.id.RG_1);
        radioGroup2=findViewById(R.id.RG_2);



        btn_fever=findViewById(R.id.btn_fever);
        btn_fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_fever) {
                    b_btn_fever = true;
                    //设置是否被激活状态，true表示被激活
                    btn_fever.setActivated(b_btn_fever);
                } else {
                    b_btn_fever = false;
                    //设置是否被激活状态，false表示未激活
                    btn_fever.setActivated(b_btn_fever);
                }
            }
        });


        btn_headache=findViewById(R.id.btn_headache);
        btn_headache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_headache) {
                    b_btn_headache = true;
                    //设置是否被激活状态，true表示被激活
                    btn_headache.setActivated(b_btn_headache);
                } else {
                    b_btn_headache = false;
                    //设置是否被激活状态，false表示未激活
                    btn_headache.setActivated(b_btn_headache);
                }
            }
        });


        btn_nausea=findViewById(R.id.btn_nausea);
        btn_nausea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_nausea) {
                    b_btn_nausea = true;
                    //设置是否被激活状态，true表示被激活
                    btn_nausea.setActivated(b_btn_nausea);
                } else {
                    b_btn_nausea = false;
                    //设置是否被激活状态，false表示未激活
                    btn_nausea.setActivated(b_btn_nausea);
                }
            }
        });

        btn_emesis=findViewById(R.id.btn_emesis);
        btn_emesis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_emesis) {
                    b_btn_emesis = true;
                    //设置是否被激活状态，true表示被激活
                    btn_emesis.setActivated(b_btn_emesis);
                } else {
                    b_btn_emesis = false;
                    //设置是否被激活状态，false表示未激活
                    btn_emesis.setActivated(b_btn_emesis);
                }
            }
        });

        btn_sweat=findViewById(R.id.btn_sweat);
        btn_sweat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_sweat) {
                    b_btn_sweat = true;
                    //设置是否被激活状态，true表示被激活
                    btn_sweat.setActivated(b_btn_sweat);
                } else {
                    b_btn_sweat = false;
                    //设置是否被激活状态，false表示未激活
                    btn_sweat.setActivated(b_btn_sweat);
                }
            }
        });

        btn_cough=findViewById(R.id.btn_cough);
        btn_cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_cough) {
                    b_btn_cough = true;
                    //设置是否被激活状态，true表示被激活
                    btn_cough.setActivated(b_btn_cough);
                } else {
                    b_btn_cough = false;
                    //设置是否被激活状态，false表示未激活
                    btn_cough.setActivated(b_btn_cough);
                }
            }
        });


        btn_fussiness=findViewById(R.id.btn_fussiness);
        btn_fussiness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_fussiness) {
                    b_btn_fussiness = true;
                    //设置是否被激活状态，true表示被激活
                    btn_fussiness.setActivated(b_btn_fussiness);
                } else {
                    b_btn_fussiness = false;
                    //设置是否被激活状态，false表示未激活
                    btn_fussiness.setActivated(b_btn_fussiness);
                }
            }
        });


        btn_rash=findViewById(R.id.btn_rash);
        btn_rash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_rash) {
                    b_btn_rash = true;
                    //设置是否被激活状态，true表示被激活
                    btn_rash.setActivated(b_btn_rash);
                } else {
                    b_btn_rash = false;
                    //设置是否被激活状态，false表示未激活
                    btn_rash.setActivated(b_btn_rash);
                }
            }
        });

        btn_epilepsy=findViewById(R.id.btn_epilepsy);
        btn_epilepsy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_epilepsy) {
                    b_btn_epilepsy = true;
                    //设置是否被激活状态，true表示被激活
                    btn_epilepsy.setActivated(b_btn_epilepsy);
                } else {
                    b_btn_epilepsy = false;
                    //设置是否被激活状态，false表示未激活
                    btn_epilepsy.setActivated(b_btn_epilepsy);
                }
            }
        });

        btn_weight=findViewById(R.id.btn_weight);
        btn_weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_weight) {
                    b_btn_weight = true;
                    //设置是否被激活状态，true表示被激活
                    btn_weight.setActivated(b_btn_weight);
                } else {
                    b_btn_weight = false;
                    //设置是否被激活状态，false表示未激活
                    btn_weight.setActivated(b_btn_weight);
                }
            }
        });

        btn_flu=findViewById(R.id.btn_flu);
        btn_flu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_flu) {
                    b_btn_flu = true;
                    //设置是否被激活状态，true表示被激活
                    btn_flu.setActivated(b_btn_flu);
                } else {
                    b_btn_flu = false;
                    //设置是否被激活状态，false表示未激活
                    btn_flu.setActivated(b_btn_flu);
                }
            }
        });

        btn_tympanitis=findViewById(R.id.btn_tympanitis);
        btn_tympanitis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_tympanitis) {
                    b_btn_tympanitis = true;
                    //设置是否被激活状态，true表示被激活
                    btn_tympanitis.setActivated(b_btn_tympanitis);
                } else {
                    b_btn_tympanitis = false;
                    //设置是否被激活状态，false表示未激活
                    btn_tympanitis.setActivated(b_btn_tympanitis);
                }
            }
        });

        btn_gastroenteritis=findViewById(R.id.btn_gastroenteritis);
        btn_gastroenteritis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_gastroenteritis) {
                    b_btn_gastroenteritis = true;
                    //设置是否被激活状态，true表示被激活
                    btn_gastroenteritis.setActivated(b_btn_gastroenteritis);
                } else {
                    b_btn_gastroenteritis = false;
                    //设置是否被激活状态，false表示未激活
                    btn_gastroenteritis.setActivated(b_btn_gastroenteritis);
                }
            }
        });

        btn_herpes=findViewById(R.id.btn_herpes);
        btn_herpes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_herpes) {
                    b_btn_herpes = true;
                    //设置是否被激活状态，true表示被激活
                    btn_herpes.setActivated(b_btn_herpes);
                } else {
                    b_btn_herpes = false;
                    //设置是否被激活状态，false表示未激活
                    btn_herpes.setActivated(b_btn_herpes);
                }
            }
        });

        btn_aids=findViewById(R.id.btn_aids);
        btn_aids.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_aids) {
                    b_btn_aids = true;
                    //设置是否被激活状态，true表示被激活
                    btn_aids.setActivated(b_btn_aids);
                } else {
                    b_btn_aids = false;
                    //设置是否被激活状态，false表示未激活
                    btn_aids.setActivated(b_btn_aids);
                }
            }
        });

        btn_epidemic_area=findViewById(R.id.btn_epidemic_area);
        btn_epidemic_area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_epidemic_area) {
                    b_btn_epidemic_area = true;
                    //设置是否被激活状态，true表示被激活
                    btn_epidemic_area.setActivated(b_btn_epidemic_area);
                } else {
                    b_btn_epidemic_area = false;
                    //设置是否被激活状态，false表示未激活
                    btn_epidemic_area.setActivated(b_btn_epidemic_area);
                }
            }
        });

        btn_suppurative_infections=findViewById(R.id.btn_suppurative_infections);
        btn_suppurative_infections.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_suppurative_infections) {
                    b_btn_suppurative_infections = true;
                    //设置是否被激活状态，true表示被激活
                    btn_suppurative_infections.setActivated(b_btn_suppurative_infections);
                } else {
                    b_btn_suppurative_infections = false;
                    //设置是否被激活状态，false表示未激活
                    btn_suppurative_infections.setActivated(b_btn_suppurative_infections);
                }
            }
        });

        btn_bird=findViewById(R.id.btn_bird);
        btn_bird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_bird) {
                    b_btn_bird = true;
                    //设置是否被激活状态，true表示被激活
                    btn_bird.setActivated(b_btn_bird);
                } else {
                    b_btn_bird = false;
                    //设置是否被激活状态，false表示未激活
                    btn_bird.setActivated(b_btn_bird);
                }
            }
        });

        btn_cerebral_trauma=findViewById(R.id.btn_cerebral_trauma);
        btn_cerebral_trauma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_cerebral_trauma) {
                    b_btn_cerebral_trauma = true;
                    //设置是否被激活状态，true表示被激活
                    btn_cerebral_trauma.setActivated(b_btn_cerebral_trauma);
                } else {
                    b_btn_cerebral_trauma = false;
                    //设置是否被激活状态，false表示未激活
                    btn_cerebral_trauma.setActivated(b_btn_cerebral_trauma);
                }
            }
        });

        btn_immune=findViewById(R.id.btn_immune);
        btn_immune.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_immune) {
                    b_btn_immune = true;
                    //设置是否被激活状态，true表示被激活
                    btn_immune.setActivated(b_btn_immune);
                } else {
                    b_btn_immune = false;
                    //设置是否被激活状态，false表示未激活
                    btn_immune.setActivated(b_btn_immune);
                }
            }
        });

        btn_tuberculosis=findViewById(R.id.btn_tuberculosis);
        btn_tuberculosis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_tuberculosis) {
                    b_btn_tuberculosis = true;
                    //设置是否被激活状态，true表示被激活
                    btn_tuberculosis.setActivated(b_btn_tuberculosis);
                } else {
                    b_btn_tuberculosis = false;
                    //设置是否被激活状态，false表示未激活
                    btn_tuberculosis.setActivated(b_btn_tuberculosis);
                }
            }
        });

        btn_consciousness=findViewById(R.id.btn_consciousness);
        btn_consciousness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_consciousness) {
                    b_btn_consciousness = true;
                    //设置是否被激活状态，true表示被激活
                    btn_consciousness.setActivated(b_btn_consciousness);
                } else {
                    b_btn_consciousness = false;
                    //设置是否被激活状态，false表示未激活
                    btn_consciousness.setActivated(b_btn_consciousness);
                }
            }
        });

        btn_pathological=findViewById(R.id.btn_pathological);
        btn_pathological.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_pathological) {
                    b_btn_pathological = true;
                    //设置是否被激活状态，true表示被激活
                    btn_pathological.setActivated(b_btn_pathological);
                } else {
                    b_btn_pathological = false;
                    //设置是否被激活状态，false表示未激活
                    btn_pathological.setActivated(b_btn_pathological);
                }
            }
        });

        btn_meningeal=findViewById(R.id.btn_meningeal);
        btn_meningeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_meningeal) {
                    b_btn_meningeal = true;
                    //设置是否被激活状态，true表示被激活
                    btn_meningeal.setActivated(b_btn_meningeal);
                } else {
                    b_btn_meningeal = false;
                    //设置是否被激活状态，false表示未激活
                    btn_meningeal.setActivated(b_btn_meningeal);
                }
            }
        });

        btn_optic=findViewById(R.id.btn_optic);
        btn_optic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_optic) {
                    b_btn_optic = true;
                    //设置是否被激活状态，true表示被激活
                    btn_optic.setActivated(b_btn_optic);
                } else {
                    b_btn_optic = false;
                    //设置是否被激活状态，false表示未激活
                    btn_optic.setActivated(b_btn_optic);
                }
            }
        });

        btn_cranial=findViewById(R.id.btn_cranial);
        btn_cranial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_cranial) {
                    b_btn_cranial = true;
                    //设置是否被激活状态，true表示被激活
                    btn_cranial.setActivated(b_btn_cranial);
                } else {
                    b_btn_cranial = false;
                    //设置是否被激活状态，false表示未激活
                    btn_cranial.setActivated(b_btn_cranial);
                }
            }
        });

        btn_cognitive=findViewById(R.id.btn_cognitive);
        btn_cognitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_cognitive) {
                    b_btn_cognitive = true;
                    //设置是否被激活状态，true表示被激活
                    btn_cognitive.setActivated(b_btn_cognitive);
                } else {
                    b_btn_cognitive = false;
                    //设置是否被激活状态，false表示未激活
                    btn_cognitive.setActivated(b_btn_cognitive);
                }
            }
        });

        btn_focal=findViewById(R.id.btn_focal);
        btn_focal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!b_btn_focal) {
                    b_btn_focal = true;
                    //设置是否被激活状态，true表示被激活
                    btn_focal.setActivated(b_btn_focal);
                } else {
                    b_btn_focal = false;
                    //设置是否被激活状态，false表示未激活
                    btn_focal.setActivated(b_btn_focal);
                }
            }
        });

        btn_done=findViewById(R.id.btn_done);

        //信息获取
        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //得到输入信息
                inputdata[0]=Double.parseDouble(edit_age.getText().toString());//年龄
                inputdata[1]=Double.parseDouble(edit_time.getText().toString());//发病时长
                inputdata[2]=Double.parseDouble(edit_temperature.getText().toString());//体温
                inputdata[3]=0;//格拉斯哥评分（不重要信息）
                inputdata[4]=Double.parseDouble(edit_pressure.getText().toString());//腰穿压力
                inputdata[5]=Double.parseDouble(edit_leucocyte.getText().toString());//白细胞总数
                inputdata[6]=Double.parseDouble(edit_monor.getText().toString());//单核细胞比例
                inputdata[7]=Double.parseDouble(edit_lymphocyte_proportion.getText().toString());//淋巴细胞比例
                inputdata[8]=Double.parseDouble(edit_neutrophils_proportion.getText().toString());//中性粒细胞比例
                inputdata[9]=0;//浆细胞比例（不重要信息）
                inputdata[10]=0;//其他细胞比例（不重要信息）
                inputdata[11]=Double.parseDouble(edit_CFP.getText().toString());//脑脊液蛋白g/L
                inputdata[12]=Double.parseDouble(edit_CFG.getText().toString());//脑脊液糖mmol/L
                inputdata[13]=Double.parseDouble(edit_blood_sugar.getText().toString());//血糖mmol/L
                inputdata[14]=Double.parseDouble(edit_CFG_blood.getText().toString());//脑脊液糖/血糖
                inputdata[15]=Double.parseDouble(edit_LgG.getText().toString());//LgG（正常值10-40mg/L)
                inputdata[16]=Double.parseDouble(edit_LgA.getText().toString());//LgA（正常值0-6mg/L)
                inputdata[17]=Double.parseDouble(edit_LgM.getText().toString());//LgM（D1:R2
                inputdata[18]=Double.parseDouble(edit_ESR.getText().toString());//血沉mm/h
                inputdata[19]=0;//胸部CT显示可疑的结核活动病灶（有=1；无=0）（不重要信息）
                Rb=(RadioButton)findViewById(radioGroup.getCheckedRadioButtonId());
                inputdata[20]=((Rb.getText().toString().equals("男")) ? 1 : 0);//性别
                inputdata[21]=((b_btn_headache)?1:0);//头痛
                inputdata[22]=((b_btn_fussiness)?1:0);//易激怒
                inputdata[23]=((b_btn_emesis)?1:0);//呕吐
                inputdata[24]=((b_btn_fever)?1:0);//发热
                inputdata[25]=((b_btn_epilepsy)?1:0);//癫痫发作
                inputdata[26]=((b_btn_focal)?1:0);//局灶性系统损害
                inputdata[27]=((b_btn_cough)?1:0);//咳嗽
                inputdata[28]=((b_btn_sweat)?1:0);//盗汗
                inputdata[29]=((b_btn_rash)?1:0);//皮疹
                inputdata[30]=((b_btn_consciousness)?1:0);//精神行为异常
                inputdata[31]=((b_btn_cognitive)?1:0);//认知功能障碍
                inputdata[32]=((b_btn_optic)?1:0);//视乳头水肿
                inputdata[33]=((b_btn_cranial)?1:0);//颅神经麻痹
                inputdata[34]=((b_btn_meningeal)?1:0);//脑膜刺激征
                inputdata[35]=0;//颈强直（不重要信息）
                inputdata[36]=((b_btn_tuberculosis)?1:0);//结核接触史或结核病史
                inputdata[37]=((b_btn_immune)?1:0);//免疫抑制状态
                inputdata[38]=((b_btn_suppurative_infections)?1:0);//其他化脓性感染
                inputdata[39]=((b_btn_cerebral_trauma)?1:0);//脑外伤或手术史
                inputdata[40]=((b_btn_bird)?1:0);//鸽子/鸟类粪便接触史
                inputdata[41]=((b_btn_epidemic_area)?1:0);//疫区接触史
                inputdata[42]=0;//合并自身免疫性疾病（不重要信息）
                inputdata[43]=0;//脑积水（不重要信息）
                inputdata[44]=0;//脑基底膜增厚（不重要信息）
                inputdata[45]=0;//脑梗死灶（不重要信息）
                inputdata[46]=0;//疑似脑结核瘤 （不重要信息）
                inputdata[47]=0;//脑膜强化 （不重要信息）
                inputdata[48]=0;//疑似脑炎性改变（不重要信息）
                inputdata[49]=0;//头颅影像学检查7.其他（不重要信息）
                inputdata[50]=0;//头颅影像学检查无明显变化（不重要信息）


                Rb2=(RadioButton)findViewById(radioGroup2.getCheckedRadioButtonId());
                if(Rb2.getText().toString().equals("清亮")){
                    inputdata[51]=1;
                } else if(Rb2.getText().toString().equals("浑浊")){
                    inputdata[51]=2;
                } else if(Rb2.getText().toString().equals("淡黄")){
                    inputdata[51]=3;
                } else if(Rb2.getText().toString().equals("淡红")){
                    inputdata[51]=4;
                } else if(Rb2.getText().toString().equals("黄色")){
                    inputdata[51]=5;
                } else if(Rb2.getText().toString().equals("其他")){
                    inputdata[51]=6;
                }

                //处理字符串传入下一页面
                String str = Arrays.toString(inputdata);
                str=str.replace("[","");
                str=str.replace("]","");
                str=str.replaceAll(" ","");
                Intent intent = new Intent(InputActivity.this, RunActivity.class);
                Bundle bundle = new Bundle() ;
                bundle.putString("str", str) ;
                intent.putExtras(bundle) ;
                startActivity(intent);



            }
        });




    }
}
