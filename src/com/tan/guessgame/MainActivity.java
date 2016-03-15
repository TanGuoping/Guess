package com.tan.guessgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	private RadioGroup group1;
	private RadioGroup group2;
	private RadioButton a1;
	private RadioButton a2;
	private RadioButton a3;
	private RadioButton b1;
	private RadioButton b2;
	private RadioButton b3;
	
	private Button ok;
	private TextView result;
	
	private String a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        group1=(RadioGroup)findViewById(R.id.group1Id);
        a1=(RadioButton)findViewById(R.id.a1Id);
        a2=(RadioButton)findViewById(R.id.a2Id);
        a3=(RadioButton)findViewById(R.id.a3Id);
        
        group2=(RadioGroup)findViewById(R.id.group2Id);
        b1=(RadioButton)findViewById(R.id.b1Id);
        b2=(RadioButton)findViewById(R.id.b2Id);
        b3=(RadioButton)findViewById(R.id.b3Id);
        
        ok=(Button)findViewById(R.id.okId);
        result=(TextView)findViewById(R.id.resultId);
        
        group1.setOnCheckedChangeListener(new RadioGroupListener());
        group2.setOnCheckedChangeListener(new RadioGroupListener());
        
        ok.setOnClickListener(new ClickListener());
        
    }
    
    class RadioGroupListener implements OnCheckedChangeListener{

		@Override
		public void onCheckedChanged(RadioGroup group, int checkedId) {
			// TODO Auto-generated method stub
			if(checkedId==R.id.a1Id){
				a="ʯͷ";
			}
			
			else if(checkedId==R.id.a2Id){
				a="����";
			}
			
			else if(checkedId==R.id.a3Id){
				a="��";
			}
			
			if(checkedId==R.id.b1Id){
				b="ʯͷ";
			}
			
			else if(checkedId==R.id.b2Id){
				b="����";
			}
			
			else if(checkedId==R.id.b3Id){
				b="��";
			}
			
			
			
		}
    	
    }
    
    
    class ClickListener implements OnClickListener{

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
			if(a==b && a!=null){
				result.setText("ƽ��");
			}
			
			else if((a=="ʯͷ" && b=="����") || (a=="����" && b=="��") || (a=="��" && b=="ʯͷ")){
				result.setText("С��ʤ");
			}
			
			else if((b=="ʯͷ" && a=="����") || (b=="����" && a=="��") || (b=="��" && a=="ʯͷ")){
				result.setText("С��ʤ");
			}
			
			
			
		}
    	
    	
    }


}
