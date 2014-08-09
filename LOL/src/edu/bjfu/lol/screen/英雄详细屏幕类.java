package edu.bjfu.lol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.HorizontalGroup;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class Ӣ����ϸ��Ļ�� extends ��Ļ��
{
	private static final String Ӣ����ϸ��ĻĿ¼ = ������.ͼƬĿ¼ + "HeroDetailScreen/";
	private static final String ͼƬ����ļ��� = Ӣ����ϸ��ĻĿ¼ + "Pack.txt";
	private LabelStyle ���ֱ�ǩ��ʽ;
	private LabelStyle ���Ա�ǩ��ʽ;
	private Ӣ���� Ӣ��;
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	public class ����������
	{
		private static final float �ı��������ű��� = 0.5f;
		private static final int �ı�����X���� = 55;
		private static final int �ı�����Y���� = 260;
		private Label �����ı���ǩ;
		private Label �����ͷŻغ��ı���ǩ;
		private Image ����ͼ��;
		private �����б���Ա�� �����б���Ա;
		public ����������(String �����ı�, TextureRegion ����ͼƬ, int ��һ���ͷŻغ���, int �ͷż���غ���)
		{
			����ͼ�� = new Image(����ͼƬ);
			����ͼ��.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					�����б���Ա.�л�������ʾ�ı�(����������.this);
				}
			});
			�����ı���ǩ = new Label(�����ı�, ���Ա�ǩ��ʽ);
			�����ı���ǩ.setFontScale(�ı��������ű���);
			�����ı���ǩ.setSize(�����ı���ǩ.getWidth() * �ı��������ű���, �����ı���ǩ.getHeight() * �ı��������ű���);
			�����ı���ǩ.setPosition(�ı�����X����, �ı�����Y���� - �����ı���ǩ.getHeight());
			�����ͷŻغ��ı���ǩ = new Label(String.format("����ÿ%d�غ��ͷ�һ��,��%d�غ��ͷ�!", �ͷż���غ���, ��һ���ͷŻغ���), ���Ա�ǩ��ʽ);
			�����ͷŻغ��ı���ǩ.setFontScale(�ı��������ű���);
			�����ͷŻغ��ı���ǩ.setSize(�����ͷŻغ��ı���ǩ.getWidth() * �ı��������ű���, �����ͷŻغ��ı���ǩ.getHeight() * �ı��������ű���);
			�����ͷŻغ��ı���ǩ.setPosition(�ı�����X����, 158);
		}
		private void set�����б���Ա(�����б���Ա�� �����б���Ա)
		{
			this.�����б���Ա = �����б���Ա;
		}
		private void ��ʾ�����ı�(�����б���Ա�� �б���Ա)
		{
			�б���Ա.addActor(�����ı���ǩ);
			�б���Ա.addActor(�����ͷŻغ��ı���ǩ);
		}
		private void �Ƴ������ı�()
		{
			�����ı���ǩ.remove();
			�����ͷŻغ��ı���ǩ.remove();
		}
	}
	private class �����б���Ա�� extends Group
	{
		private ���������� ��ǰ��������;
		private HorizontalGroup ˮƽ���� = new HorizontalGroup();
		public �����б���Ա��(����������[] ������������)
		{
			for (���������� �������� : ������������)
			{
				ˮƽ����.addActor(��������.����ͼ��);
				��������.set�����б���Ա(this);
			}
			��ǰ�������� = ������������[0];
			��ǰ��������.��ʾ�����ı�(this);
			ScrollPane ������ = new ScrollPane(ˮƽ����);
			������.setPosition(60, 267);
			������.setSize(520, ������.getHeight());
			ˮƽ����.setSpacing(30);
			addActor(������);
		}
		private void �л�������ʾ�ı�(���������� �¼�������)
		{
			if (�¼������� != ��ǰ��������)
			{
				��ǰ��������.�Ƴ������ı�();
				�¼�������.��ʾ�����ı�(this);
				��ǰ�������� = �¼�������;
			}
		}
	}
	public Ӣ����ϸ��Ļ��(Ӣ���� Ӣ��)
	{
		this.Ӣ�� = Ӣ��;
		���ֱ�ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(239f / 255, 235f / 255, 132f / 255, 1f));
		���Ա�ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(74f / 255, 40f / 255, 8f / 255, 1));
	}
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		��̨.act();
		��̨.draw();
	}
	@Override
	public void show()
	{
		if (��̨ == null)
		{
			��̨ = new ����Ӧ��̨��();
			// ��������ͼ��
			TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(ͼƬ����ļ���));
			// ����Ƥ����Դ
			Ƥ����Դ = new Skin(����ͼ��);
			// ����
			Image ����ͼƬ = new Image(Ƥ����Դ.getRegion("Background"));
			����ͼƬ.setSize(������.��Ļ��, ������.��Ļ��);
			��̨.addActor(����ͼƬ);
			// Ӣ��ͼ��
			Image Ӣ��ͼ�� = new Image(Ӣ����.getӢ��ͼ��(Ӣ��.getӢ��Ƥ���ļ���()));
			ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, 200);
			ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, 250);
			int Ӣ��ͼ������X = 180;
			Ӣ��ͼ��.setPosition(Ӣ��ͼ������X - Ӣ��ͼ��.getWidth() / 2, 490);
			��̨.addActor(Ӣ��ͼ��);
			// Ӣ������
			Label Ӣ�����ֱ�ǩ = new Label(Ӣ��.getӢ������(), ���ֱ�ǩ��ʽ);
			float �������ű��� = 0.8f;
			Ӣ�����ֱ�ǩ.setFontScale(�������ű���);
			Ӣ�����ֱ�ǩ.setSize(Ӣ�����ֱ�ǩ.getWidth() * �������ű���, Ӣ�����ֱ�ǩ.getHeight() * �������ű���);
			Ӣ�����ֱ�ǩ.setPosition(Ӣ��ͼ������X - Ӣ�����ֱ�ǩ.getWidth() / 2, 435);
			��̨.addActor(Ӣ�����ֱ�ǩ);
			int ����X���� = 355;
			// ����ֵ
			Label ����ֵ��ǩ = new Label(String.format("����ֵ:%d", Ӣ��.getӢ������().get�������ֵ()), ���Ա�ǩ��ʽ);
			����ֵ��ǩ.setPosition(����X����, 670);
			��̨.addActor(����ֵ��ǩ);
			// ������
			Label ��������ǩ = new Label(String.format("������:%d", Ӣ��.getӢ������().get������()), ���Ա�ǩ��ʽ);
			��������ǩ.setPosition(����X����, 629);
			��̨.addActor(��������ǩ);
			// �����ٶ�
			Label �����ٶȱ�ǩ = new Label(String.format("�����ٶ�:%.2f", Ӣ��.getӢ������().get�����ٶ�()), ���Ա�ǩ��ʽ);
			�����ٶȱ�ǩ.setPosition(����X����, 588);
			��̨.addActor(�����ٶȱ�ǩ);
			// ����ֵ
			Label ����ֵ��ǩ = new Label(String.format("����ֵ:%d", Ӣ��.getӢ������().get����ֵ()), ���Ա�ǩ��ʽ);
			����ֵ��ǩ.setPosition(����X����, 547);
			��̨.addActor(����ֵ��ǩ);
			// ����ֵ
			Label ����ֵ��ǩ = new Label(String.format("����ֵ:%d", Ӣ��.getӢ������().get����ֵ()), ���Ա�ǩ��ʽ);
			����ֵ��ǩ.setPosition(����X����, 506);
			��̨.addActor(����ֵ��ǩ);
			// ħ������
			Label ħ�����Ա�ǩ = new Label(String.format("ħ������:%d", Ӣ��.getӢ������().getħ������()), ���Ա�ǩ��ʽ);
			ħ�����Ա�ǩ.setPosition(����X����, 465);
			��̨.addActor(ħ�����Ա�ǩ);
			// �����ظ�
			Label �����ظ���ǩ = new Label(String.format("�����ظ�:%d", Ӣ��.getӢ������().get�����ظ�()), ���Ա�ǩ��ʽ);
			�����ظ���ǩ.setPosition(����X����, 424);
			��̨.addActor(�����ظ���ǩ);
			// �����б�
			��̨.addActor(new �����б���Ա��(Ӣ��.getӢ����������(Ӣ����ϸ��Ļ��.this)));
			// ���ذ�ť
			Button ���ذ�ť = new Button(����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonUp"), ����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonDown"));
			���ذ�ť.setPosition(21, 770);
			���ذ�ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����.ʵ��.���Ű�ť����();
					����.ʵ��.�˳���Ļ();
				}
			});
			��̨.addActor(���ذ�ť);
			// Ӣ������
			Ӣ��.getӢ������().play();
		}
		// �����û�����
		Gdx.input.setInputProcessor(��̨);
	}
	@Override
	public void dispose()
	{
		if (��̨ != null)
		{
			��̨.dispose();
		}
		if (Ƥ����Դ != null)
		{
			Ƥ����Դ.dispose();
		}
	}
}
