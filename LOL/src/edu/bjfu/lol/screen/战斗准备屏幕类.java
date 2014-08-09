package edu.bjfu.lol.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.bjfu.lol.����;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.scenes.scene2d.ui.��Բת����Ա��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ս��׼����Ļ�� extends ��Ļ��
{
	private static final String ս��׼����ĻĿ¼ = ������.ͼƬĿ¼ + "BattlePrepareScreen/";
	private static final String ͼƬ����ļ��� = ս��׼����ĻĿ¼ + "Pack.txt";
	private LabelStyle ���ֱ�ǩ��ʽ;
	private LabelStyle ���Ա�ǩ��ʽ;
	private Label ���ֱ�ǩ;
	private Label ������ǩ;
	private Label �ظ���ǩ;
	private Label ���ֱ�ǩ;
	private Label ������ǩ;
	private Label ���ٱ�ǩ;
	private Label ���ױ�ǩ;
	private Label ħ����ǩ;
	private ͷ���б��� ͷ���б�;
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private ��Բת����Ա�� ת����Ա;
	private ����Ļ�� ����Ļ;
	private class ͷ���� extends Group
	{
		public ͷ����(Ӣ���� Ӣ��, final int �±�)
		{
			Image ͷ�� = new Image(Ӣ�� == null ? Ƥ����Դ.getRegion("Add") : Ӣ��.getӢ��ͷ��());
			addActor(ͷ��);
			if (Ӣ�� == null)
			{
				SequenceAction ˳���� = new SequenceAction();
				˳����.addAction(Actions.fadeIn(1));
				˳����.addAction(Actions.fadeOut(1));
				RepeatAction �ظ����� = Actions.forever(˳����);
				addAction(�ظ�����);
				ͷ��.setPosition(47, 0);
			}
			else
			{
				ͷ��.setSize(80, 80);
			}
			addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����.ʵ��.���Ű�ť����();
					ͷ���б�.setѡ���±�(�±�);
					ת����Ա.ת��Ŀ��λ��(�±�);
				}
			});
		}
	}
	private class ͷ���б���
	{
		private Image ѡ�п�;
		private ͷ����[] ͷ������ = new ͷ����[5];
		public ͷ���б���()
		{
			ѡ�п� = new Image(Ƥ����Դ.getRegion("Highlight"));
			Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
			for (int i = 0; i < ͷ������.length; i++)
			{
				ͷ������[i] = new ͷ����(Ӣ������[i], i);
				ͷ������[i].setPosition(i * 125 + 30, Ӣ������[i] == null ? 671 : 674);
				ͷ������[i].setSize(80, 80);
				��̨.addActor(ͷ������[i]);
			}
			��̨.addActor(ѡ�п�);
			setѡ���±�(ת����Ա.get��Ļ����Ӣ���±�());
		}
		private void ����ͷ��(int �±�)
		{
			ͷ������[�±�].remove();
			Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
			ͷ������[�±�] = new ͷ����(Ӣ������[�±�], �±�);
			ͷ������[�±�].setPosition(�±� * 125 + 30, Ӣ������[�±�] == null ? 671 : 674);
			ͷ������[�±�].setSize(80, 80);
			��̨.addActor(ͷ������[�±�]);
		}
		private void ����ͷ��()
		{
			for (int i = 0; i < ͷ������.length; i++)
			{
				ͷ������[i].remove();
				Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
				ͷ������[i] = new ͷ����(Ӣ������[i], i);
				ͷ������[i].setPosition(i * 125 + 30, Ӣ������[i] == null ? 671 : 674);
				ͷ������[i].setSize(80, 80);
				��̨.addActor(ͷ������[i]);
			}
		}
		private void setѡ���±�(int ѡ���±�)
		{
			ѡ�п�.setPosition(ѡ���±� * 125 + 22, 666);
		}
	}
	public ս��׼����Ļ��(��Բת����Ա�� ת����Ա, ����Ļ�� ����Ļ)
	{
		this.ת����Ա = ת����Ա;
		this.����Ļ = ����Ļ;
		���ֱ�ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(239f / 255, 227f / 255, 8f / 255, 1f));
		���Ա�ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(255f / 255, 198f / 255, 8f / 255, 1f));
	}
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		��̨.act();
		if (ת����Ա.is�ص�����())
		{
			���ñ�ǩ();
			ͷ���б�.setѡ���±�(ת����Ա.get��Ļ����Ӣ���±�());
		}
		��̨.draw();
	}
	@Override
	public void show()
	{
		if (��̨ == null)
		{
			��̨ = new ����Ӧ��̨��();
			��̨.addListener(new InputListener()
			{
				private static final float ת�̽����¼������꿪ʼ = 180;
				private static final float ת�̽����¼���������� = 664;
				private float ��һ�ΰ��º�����;
				private boolean isת�̱��϶�;
				@Override
				public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
				{
					if (y >= ת�̽����¼������꿪ʼ && y <= ת�̽����¼����������)
					{
						��һ�ΰ��º����� = x;
						ת����Ա.��֪ͨ�����Ѱ���();
						return true;
					}
					else
					{
						return false;
					}
				}
				@Override
				public void touchDragged(InputEvent event, float x, float y, int pointer)
				{
					if (Math.abs(x - ��һ�ΰ��º�����) >= 0.1f)
					{
						ת����Ա.��ת��Ļ����λ��((x - ��һ�ΰ��º�����) / ������.��Ļ�� * 2f);
						��һ�ΰ��º����� = x;
						isת�̱��϶� = true;
					}
				}
				@Override
				public void touchUp(InputEvent event, float x, float y, int pointer, int button)
				{
					ת����Ա.��֪ͨ�������ɿ�();
					if (isת�̱��϶�)
					{
						isת�̱��϶� = false;
					}
					else if (x >= ��Բת����Ա��.ת�����ĺ����� - ������.��Ļ�� / 3 && x <= ��Բת����Ա��.ת�����ĺ����� + ������.��Ļ�� / 3 && ת����Ա.is�ص�����())
					{
						����.ʵ��.������Ļ(new ѡ��Ӣ����Ļ��(ת����Ա.get��Ļ����Ӣ���±�(), ս��׼����Ļ��.this));
					}
				}
			});
			// ��������ͼ��
			TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(ͼƬ����ļ���));
			// ����Ƥ����Դ
			Ƥ����Դ = new Skin(����ͼ��);
			// ����
			Image ����ͼƬ = new Image(Ƥ����Դ.getRegion("Background"));
			����ͼƬ.setSize(������.��Ļ��, ������.��Ļ��);
			��̨.addActor(����ͼƬ);
			// ���ذ�ť
			Button ���ذ�ť = new Button(����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonUp"), ����.ʵ��.getUIƤ����Դ().getDrawable("BackButtonDown"));
			���ذ�ť.setPosition(21, 770);
			���ذ�ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����Ļ.�ָ�ת��();
					����.ʵ��.���Ű�ť����();
					����.ʵ��.�˳���Ļ();
				}
			});
			��̨.addActor(���ذ�ť);
			// ����ť
			Button ����ť = new Button(Ƥ����Դ.getDrawable("EmbattleButtonUp"), Ƥ����Դ.getDrawable("EmbattleButtonDown"));
			����ť.setPosition(521, 770);
			����ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					����.ʵ��.���Ű�ť����();
					����.ʵ��.������Ļ(new ������Ļ��(ս��׼����Ļ��.this));
				}
			});
			��̨.addActor(����ť);
			// ת��
			��̨.addActor(ת����Ա);
			// ͷ���б���
			ͷ���б� = new ͷ���б���();
			���ñ�ǩ();
		}
		// �����û�����
		Gdx.input.setInputProcessor(��̨);
	}
	public void ����������Ϣ()
	{
		ͷ���б�.����ͷ��();
		ת����Ա.����Ӣ��ͼ��();
	}
	public void ����������Ϣ(int Ӣ���±�)
	{
		ͷ���б�.����ͷ��(Ӣ���±�);
		ת����Ա.����Ӣ��ͼ��(Ӣ���±�);
		���ñ�ǩ();
	}
	private void ���ñ�ǩ()
	{
		Ӣ���� Ӣ�� = �����Ϣ��.get����().getӢ������()[ת����Ա.get��Ļ����Ӣ���±�()];
		// ��һ����ӱ�ǩ
		if (���ֱ�ǩ == null)
		{
			float �������� = 0.75f;
			// ���ֱ�ǩ
			���ֱ�ǩ = new Label("???", ���ֱ�ǩ��ʽ);
			���ֱ�ǩ.setPosition(30, 130);
			���ֱ�ǩ.setFontScale(��������);
			��̨.addActor(���ֱ�ǩ);
			// ������ǩ
			������ǩ = new Label("����???", ���Ա�ǩ��ʽ);
			������ǩ.setPosition(200, 130);
			������ǩ.setFontScale(��������);
			��̨.addActor(������ǩ);
			// �ظ���ǩ
			�ظ���ǩ = new Label("�ظ�???", ���Ա�ǩ��ʽ);
			�ظ���ǩ.setPosition(200 + 160, 130);
			�ظ���ǩ.setFontScale(��������);
			��̨.addActor(�ظ���ǩ);
			// ���ֱ�ǩ
			���ֱ�ǩ = new Label("����???", ���Ա�ǩ��ʽ);
			���ֱ�ǩ.setPosition(200 + 150 + 150, 130);
			���ֱ�ǩ.setFontScale(��������);
			��̨.addActor(���ֱ�ǩ);
			// ������ǩ
			������ǩ = new Label("����???", ���Ա�ǩ��ʽ);
			������ǩ.setPosition(30, 90);
			������ǩ.setFontScale(��������);
			��̨.addActor(������ǩ);
			// ���ٱ�ǩ
			���ٱ�ǩ = new Label("����???", ���Ա�ǩ��ʽ);
			���ٱ�ǩ.setPosition(200, 90);
			���ٱ�ǩ.setFontScale(��������);
			��̨.addActor(���ٱ�ǩ);
			// ���ױ�ǩ
			���ױ�ǩ = new Label("����???", ���Ա�ǩ��ʽ);
			���ױ�ǩ.setPosition(200 + 160, 90);
			���ױ�ǩ.setFontScale(��������);
			��̨.addActor(���ױ�ǩ);
			// ħ����ǩ
			ħ����ǩ = new Label("ħ��???", ���Ա�ǩ��ʽ);
			ħ����ǩ.setPosition(200 + 150 + 150, 90);
			ħ����ǩ.setFontScale(��������);
			��̨.addActor(ħ����ǩ);
		}
		���ֱ�ǩ.setText(Ӣ�� == null ? "???" : Ӣ��.getӢ������());
		������ǩ.setText(String.format("����%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().get�������ֵ())));
		�ظ���ǩ.setText(String.format("�ظ�%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().get�����ظ�())));
		���ֱ�ǩ.setText(String.format("����%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().get����ֵ())));
		������ǩ.setText(String.format("����%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().get������())));
		���ٱ�ǩ.setText(String.format("����%s", Ӣ�� == null ? "???" : String.format("%.2f", Ӣ��.getӢ������().get�����ٶ�())));
		���ױ�ǩ.setText(String.format("����%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().get����ֵ())));
		ħ����ǩ.setText(String.format("ħ��%s", Ӣ�� == null ? "???" : String.valueOf(Ӣ��.getӢ������().getħ������())));
	}
	@Override
	public void dispose()
	{
		if (��̨ != null)
		{
			��̨.dispose();
			��̨ = null;
		}
		if (Ƥ����Դ != null)
		{
			Ƥ����Դ.dispose();
			Ƥ����Դ = null;
		}
	}
}
