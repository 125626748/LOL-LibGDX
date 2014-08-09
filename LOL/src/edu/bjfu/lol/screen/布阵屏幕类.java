package edu.bjfu.lol.screen;

import java.util.Arrays;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.bjfu.lol.����;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ������Ļ�� extends ��Ļ��
{
	private static final String ������ĻĿ¼ = ������.ͼƬĿ¼ + "EmbattleScreen/";
	private static final String ͼƬ����ļ��� = ������ĻĿ¼ + "Pack.txt";
	private static final int Ӣ��ͼƬ���߶� = 170;
	private static final int Ӣ��ͼƬ����� = 150;
	private static final int[] X�������� = new int[]{165, 360, 60, 465, 265};
	private static final int[] Y�������� = new int[]{550, 550, 434, 434, 328};
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private ������Ա�� ������Ա;
	private Ӣ����[] Ӣ����������;
	private ս��׼����Ļ�� ս��׼����Ļ;
	private class ������Ա��
	{
		private Image[] Ӣ��ͼƬ���� = new Image[5];
		private ������Ա��()
		{
			Ӣ����[] Ӣ������ = �����Ϣ��.get����().getӢ������();
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (Ӣ������[i] != null)
				{
					final Image ͼƬ = new Image(Ӣ����.getӢ��ͼ��(Ӣ������[i].getӢ��Ƥ���ļ���()));
					ͼ�������.������Ա��������ָ������(ͼƬ, Ӣ��ͼƬ�����);
					ͼ�������.������Ա��������ָ������(ͼƬ, Ӣ��ͼƬ���߶�);
					ͼƬ.setPosition(X��������[i], Y��������[i]);
					��̨.addActor(ͼƬ);
					Ӣ��ͼƬ����[i] = ͼƬ;
				}
			}
		}
		private int ����Ӣ���±�(float x, float y)
		{
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (Ӣ��ͼƬ����[i] != null && x >= X��������[i] && x <= X��������[i] + Ӣ��ͼƬ����[i].getWidth() && y >= Y��������[i] && y <= Y��������[i] + Ӣ��ͼƬ����[i].getHeight())
				{
					return i;
				}
			}
			return -1;
		}
		private void ����ͼƬλ��(int ����Ӣ���±�, int �ͷ�Ӣ���±�)
		{
			Image �������� = Ӣ��ͼƬ����[����Ӣ���±�]; 
			Ӣ��ͼƬ����[����Ӣ���±�] = Ӣ��ͼƬ����[�ͷ�Ӣ���±�];
			Ӣ��ͼƬ����[�ͷ�Ӣ���±�] = ��������;
			��������.setPosition(X��������[�ͷ�Ӣ���±�], Y��������[�ͷ�Ӣ���±�]);
			if (Ӣ��ͼƬ����[����Ӣ���±�] != null)
			{
				Ӣ��ͼƬ����[����Ӣ���±�].setPosition(X��������[����Ӣ���±�], Y��������[����Ӣ���±�]);
			}
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (Ӣ��ͼƬ����[i] != null)
				{
					Ӣ��ͼƬ����[i].remove();
					��̨.addActor(Ӣ��ͼƬ����[i]);
				}
			}
		}
		private void �ͷ�Ӣ��(int ����Ӣ���±�, float x, float y)
		{
			int �ͷ�Ӣ���±� = -1;
			for (int i = 0; i < Ӣ��ͼƬ����.length; i++)
			{
				if (x >= X��������[i] && x <= X��������[i] + Ӣ��ͼƬ����� && y >= Y��������[i] && y <= Y��������[i] + Ӣ��ͼƬ���߶�)
				{
					�ͷ�Ӣ���±� = i;
					break;
				}
			}
			if (�ͷ�Ӣ���±� >= 0)
			{
				����ͼƬλ��(����Ӣ���±�, �ͷ�Ӣ���±�);
				// ��������������ı���
				Ӣ���� �������� = Ӣ����������[�ͷ�Ӣ���±�];
				Ӣ����������[�ͷ�Ӣ���±�] = Ӣ����������[����Ӣ���±�];
				Ӣ����������[����Ӣ���±�] = ��������;
			}
			else
			{
				Ӣ��ͼƬ����[����Ӣ���±�].setPosition(X��������[����Ӣ���±�], Y��������[����Ӣ���±�]);
			}
		}
	}
	public ������Ļ��(ս��׼����Ļ�� ս��׼����Ļ)
	{
		this.ս��׼����Ļ = ս��׼����Ļ;
		Ӣ���������� = Arrays.copyOf(�����Ϣ��.get����().getӢ������(), 5);
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
			��̨.addListener(new InputListener()
			{
				private int ����Ӣ���±�;
				private Image ���϶�ͼƬ;
				private float ����Xƫ��;
				private float ����Yƫ��;
				@Override
				public boolean touchDown(InputEvent event, float x, float y, int pointer, int button)
				{
					if (y >= 205 && y <= 737)
					{
						����Ӣ���±� = ������Ա.����Ӣ���±�(x, y);
						if (����Ӣ���±� >= 0)
						{
							���϶�ͼƬ = ������Ա.Ӣ��ͼƬ����[����Ӣ���±�];
							����Xƫ�� = x - ������Ա.Ӣ��ͼƬ����[����Ӣ���±�].getX();
							����Yƫ�� = y - ������Ա.Ӣ��ͼƬ����[����Ӣ���±�].getY();
							return true;
						}
					}
					return false;
				}
				@Override
				public void touchDragged(InputEvent event, float x, float y, int pointer)
				{
					if (���϶�ͼƬ != null)
					{
						���϶�ͼƬ.setPosition(x - ����Xƫ��, y - ����Yƫ��);
					}
				}
				@Override
				public void touchUp(InputEvent event, float x, float y, int pointer, int button)
				{
					if (���϶�ͼƬ != null)
					{
						������Ա.�ͷ�Ӣ��(����Ӣ���±�, x, y);
						���϶�ͼƬ = null;
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
			// ���水ť
			Button ���水ť = new Button(Ƥ����Դ.getDrawable("SaveButtonUp"), Ƥ����Դ.getDrawable("SaveButtonDown"));
			���水ť.setPosition((������.��Ļ�� - ���水ť.getWidth()) / 2, 120);
			���水ť.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					�����Ϣ��.get����().setӢ������(Ӣ����������);
					ս��׼����Ļ.����������Ϣ();
					�����Ϣ��.��������();
					����.ʵ��.���Ű�ť����();
					����.ʵ��.�˳���Ļ();
				}
			});
			��̨.addActor(���水ť);
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
			// ������Ա
			������Ա = new ������Ա��();
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
