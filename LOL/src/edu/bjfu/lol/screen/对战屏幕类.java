package edu.bjfu.lol.screen;

import java.util.LinkedList;
import java.util.Queue;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.BitmapFont.TextBounds;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

import edu.bjfu.lol.����;
import edu.bjfu.lol.������Ϣ��;
import edu.bjfu.lol.�����Ϣ��;
import edu.bjfu.lol.scenes.scene2d.����Ӧ��̨��;
import edu.bjfu.lol.scenes.scene2d.actions.��������X��С���Ա仯Action;
import edu.bjfu.lol.scenes.scene2d.actions.Χ��ԭ��תȦ�ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.ui.��������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.���ж�����;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��ս��Ļ�� extends ��Ļ��
{
	private static final String ��ս��ĻĿ¼ = ������.ͼƬĿ¼ + "BattleScreen/";
	private static final String ͼƬ����ļ��� = ��ս��ĻĿ¼ + "Pack.txt";
	public static final int Ӣ��ͼƬ���߶� = 198;
	public static final int Ӣ��ͼƬ����� = 153;
	private static final float �ż���ǰ����� = 1.2f;
	private static final int[] �ҷ�����λ��0��λX����ƫ������ = new int[]{0, 144, -120, 192, -15};
	private static final int[] �ҷ�����λ��0��λY����ƫ������ = new int[]{0, -21, -70, -148, -160};
	private static final int �غ�����ǩX���� = ������.��Ļ�� / 2;
	private static final int �غ�����ǩY���� = 845;
	public static final int[] �ҷ�X�������� = new int[]{191,0,0,0,0};
	public static final int[] �ҷ�Y�������� = new int[]{336,0,0,0,0};
	public static final int[] �з�X�������� = new int[]{330,0,0,0,0};
	public static final int[] �з�Y�������� = new int[]{550,0,0,0,0};
	// ���������˽��н���,�Լ���ͨ�ŵĿ���
	public static ��ս��Ļ�� ʵ��;
	static
	{
		for (int i = 1; i < 5; i++)
		{
			�ҷ�X��������[i] = �ҷ�X��������[0] + �ҷ�����λ��0��λX����ƫ������[i];
			�ҷ�Y��������[i] = �ҷ�Y��������[0] + �ҷ�����λ��0��λY����ƫ������[i];
			if (i == 4)
			{
				�з�X��������[i] = �з�X��������[0] - �ҷ�����λ��0��λX����ƫ������[i];
			}
			else
			{
				�з�X��������[i] = �з�X��������[0] + �ҷ�����λ��0��λX����ƫ������[i];
			}
			�з�Y��������[i] = �з�Y��������[0] - �ҷ�����λ��0��λY����ƫ������[i];
		}
	}
	public static class Ӣ�������� extends Group
	{
		private static final int Ѫ���߶� = 10;
		private static final float Ѫ�������ռӢ�ۿ�ȱ��� = 0.6f;
		// Ӣ�����;�ֹʱ���
		private float ������;
		private float ������;
		private static final float ��Ĭͼ�����ű��� = 0.25f;
		private boolean is���ڱ���Ĭ;
		private Image ��Ĭͼ��;
		private boolean is���ڱ�����;
		private Image ����ͼ��;
		private boolean is���ڱ�ѣ��;
		private Image ѣ��ͼ��;
		private boolean is���ڱ�ѹ��;
		private Image ѹ��ͼ��;
		private boolean is���ڱ�����;
		private Image ����ͼ��;
		private boolean is���ڱ�����;
		private boolean is���ڱ���ä;
		private Image ��äͼ��;
		private boolean is��������;
		private ������Ա�� ����Ч��;
		private ������Ա�� ����Ҷ��Ч��;
		private ������Ա�� ����Ч��;
		private boolean is���ڱ�����;
		private Image Ӣ��;
		private ��������Ա�� Ѫ��;
		private float Ӣ��X;
		private int ����Z���;
		public Ӣ��������(float Ӣ��X, Image Ӣ��ͼ��, TextureRegion Ѫ��ǰ, TextureRegion Ѫ����)
		{
			this.Ӣ��X = Ӣ��X;
			this.Ӣ�� = Ӣ��ͼ��;
			Ѫ�� = new ��������Ա��(Ѫ��ǰ, Ѫ����, Ӣ��ͼƬ����� * Ѫ�������ռӢ�ۿ�ȱ���, Ѫ���߶�);
			Ѫ��.set����(1);
			addActor(Ӣ��);
			addActor(Ѫ��);
			Ѫ��.setWidth(Ѫ�������ռӢ�ۿ�ȱ��� * Ӣ��ͼƬ�����);
			Ѫ��.setX((1 - Ѫ�������ռӢ�ۿ�ȱ���) * Ӣ��ͼƬ����� / 2);
			Ӣ��.setY(Ѫ��.getHeight());
			setSize(Ӣ��.getWidth(), Ӣ��.getHeight() + Ѫ��.getHeight());
			������ = getWidth();
			������ = getHeight();
			// ��Ĭͼ��
			��Ĭͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Silence"));
			��Ĭͼ��.setSize(��Ĭͼ��.getWidth() * ��Ĭͼ�����ű���, ��Ĭͼ��.getHeight() * ��Ĭͼ�����ű���);
			��Ĭͼ��.setPosition((Ӣ��.getWidth() - ��Ĭͼ��.getWidth()) / 2, Ӣ��.getY() + Ӣ��.getHeight());
			// ����ͼ��
			����ͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Frozen"));
			ͼ�������.������Ա��������ָ������(����ͼ��, Ӣ��.getWidth() * 1.1f);
			����ͼ��.setPosition((Ӣ��.getWidth() - ����ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����ͼ��.getHeight()) / 2);
			// ѣ��ͼ��
			ѣ��ͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Stun"));
			ͼ�������.������Ա��������ָ������(ѣ��ͼ��, Ӣ��.getWidth());
			ѣ��ͼ��.setOrigin(ѣ��ͼ��.getWidth() / 2, ѣ��ͼ��.getHeight() / 2);
			ѣ��ͼ��.addAction(Actions.forever(Actions.rotateBy(-100, 0.3f)));
			ѣ��ͼ��.setPosition((Ӣ��.getWidth() - ѣ��ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ѣ��ͼ��.getHeight()) / 2);
			// ѹ��ͼ��
			ѹ��ͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Bound"));
			ͼ�������.������Ա��������ָ������(ѹ��ͼ��, Ӣ��.getWidth());
			ѹ��ͼ��.setPosition((Ӣ��.getWidth() - ѹ��ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ѹ��ͼ��.getHeight()) / 2);
			// ����ͼ��
			����ͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Horror"));
			ͼ�������.������Ա��������ָ������(����ͼ��, Ӣ��.getWidth() * 0.5f);
			float ��˸���� = 0.2f;
			����ͼ��.addAction(Actions.forever(Actions.sequence(Actions.alpha(0, ��˸���� / 2), Actions.alpha(1, ��˸���� / 2))));
			����ͼ��.setPosition((Ӣ��.getWidth() - ����ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����ͼ��.getHeight()) / 2);
			// ����Ч��
			TextureRegion[] ����ͼ������ = new TextureRegion[2];
			����ͼ������[0] = ��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("AeroA");
			����ͼ������[1] = ��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("AeroB");
			����Ч�� = new ������Ա��(0.1f, ����ͼ������, Animation.LOOP);
			����Ч��.setColor(new Color(1, 1, 1, 0.2f));
			ͼ�������.������Ա��������ָ������(����Ч��, Ӣ��.getWidth() * 0.8f);
			����Ч��.setPosition((Ӣ��.getWidth() - ����Ч��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����Ч��.getHeight()) / 2);
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AeroLeaf.p"), ��ս��Ļ��.ʵ��.Ƥ����Դ.getAtlas());
			����Ҷ��Ч�� = new ������Ա��(����Ч��);
			����Ҷ��Ч��.addAction(Actions.forever(new Χ��ԭ��תȦ�ƶ�Action(Ӣ��.getWidth() / 2, Ӣ��.getY() + Ӣ��.getHeight() / 2, ����Ч��.getWidth() / 2 * 0.7f, 1f)));
			// ��äͼ��
			��äͼ�� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("Blind"));
			ͼ�������.������Ա��������ָ������(��äͼ��, Ӣ��.getWidth() * 0.4f);
			��äͼ��.setPosition((Ӣ��.getWidth() - ��äͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ��äͼ��.getHeight()) / 2);
			// ����Ч��
			����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "Fired.p"), ��ս��Ļ��.ʵ��.Ƥ����Դ.getAtlas());
			����Ч�� = new ������Ա��(����Ч��);
			����Ч��.setPosition(Ӣ��.getWidth() / 2, Ӣ��.getY() + Ӣ��.getHeight() / 2);
		}
		public void ��������Z���()
		{
			����Z��� = getZIndex();
		}
		public int get����Z���()
		{
			return ����Z���;
		}
		public void ����Ӣ������ͼƬ(Drawable ����ͼ)
		{
			removeActor(Ѫ��);
			Ѫ�� = null;
			Ӣ��.setDrawable(����ͼ);
			Ӣ��.setSize(100, 100);
			Ӣ��.setPosition(0, 0);
			setX(Ӣ��X - Ӣ��.getWidth() / 2);
			setSize(Ӣ��.getWidth(), Ӣ��.getHeight());
		}
		public void ����Ѫ���ٷֱ�(float �ٷֱ�)
		{
			if (Ѫ�� != null)
			{
				Ѫ��.set����(�ٷֱ�);
			}
		}
		/**
		 * �õ���ӦӢ��ͼ������X��Ӧ��Ӣ�����͵�Position.x
		 */
		private float getĿ��X��Ӧλ��X(float Ŀ��X)
		{
			return Ŀ��X - Ӣ��.getWidth() / 2;
		}
		/**
		 * �õ���ӦӢ��ͼ������Y��Ӧ��Ӣ�����͵�Position.y
		 */
		private float getĿ��Y��Ӧλ��Y(float Ŀ��Y)
		{
			if (Ѫ�� == null)
			{
				return Ŀ��Y - Ӣ��.getHeight() / 2;
			}
			else
			{
				return Ŀ��Y - Ӣ��.getHeight() / 2 - Ѫ��.getHeight();
			}
		}
		// ֻ��Ӣ����ת��Ѫ��������ת
		@Override
		public void rotate(float amountInDegrees)
		{
			Ӣ��.rotate(amountInDegrees);
		}
		@Override
		public void setSize(float width, float height)
		{
			if (getWidth() > 0 && Ѫ�� != null)
			{
				float ���ű��� = width / getWidth();
				Ӣ��.setSize(Ӣ��.getWidth() * ���ű���, Ӣ��.getHeight() * ���ű���);
				Ѫ��.setSize(���ű��� * Ѫ��.getWidth(), ���ű��� * Ѫ��.getHeight());
				Ѫ��.setX((1 - Ѫ�������ռӢ�ۿ�ȱ���) * Ӣ��ͼƬ����� / 2);
				Ӣ��.setY(Ѫ��.getHeight());
				if (is���ڱ���Ĭ)
				{
					��Ĭͼ��.setPosition((Ӣ��.getWidth() - ��Ĭͼ��.getWidth()) / 2, Ӣ��.getY() + Ӣ��.getHeight());
				}
				if (is���ڱ�����)
				{
					����ͼ��.setPosition((Ӣ��.getWidth() - ����ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����ͼ��.getHeight()) / 2);
				}
				if (is���ڱ�ѣ��)
				{
					ѣ��ͼ��.setPosition((Ӣ��.getWidth() - ѣ��ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ѣ��ͼ��.getHeight()) / 2);
				}
				if (is���ڱ�ѹ��)
				{
					ѹ��ͼ��.setPosition((Ӣ��.getWidth() - ѹ��ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ѹ��ͼ��.getHeight()) / 2);
				}
				if (is���ڱ�����)
				{
					����ͼ��.setPosition((Ӣ��.getWidth() - ����ͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����ͼ��.getHeight()) / 2);
				}
				if (is���ڱ�����)
				{
					����Ч��.setPosition((Ӣ��.getWidth() - ����Ч��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ����Ч��.getHeight()) / 2);
				}
				if (is���ڱ���ä)
				{
					��äͼ��.setPosition((Ӣ��.getWidth() - ��äͼ��.getWidth()) / 2, Ӣ��.getY() + (Ӣ��.getHeight() - ��äͼ��.getHeight()) / 2);
				}
				if (is���ڱ�����)
				{
					����Ч��.setPosition(Ӣ��.getWidth() / 2, Ӣ��.getY() + Ӣ��.getHeight() / 2);
				}
			}
			super.setSize(width, height);
		}
		public void set����(boolean is����)
		{
			if (is���� != is��������)
			{
				is�������� = is����;
				Ӣ��.setColor(1, 1, 1, is���� ? 0.2f : 1);
			}
		}
		public void set��Ĭ(boolean is��Ĭ)
		{
			if (is���ڱ���Ĭ != is��Ĭ)
			{
				is���ڱ���Ĭ = is��Ĭ;
				if (is��Ĭ)
				{
					addActor(��Ĭͼ��);
				}
				else
				{
					��Ĭͼ��.remove();
				}
			}
		}
		public void set����(boolean is����)
		{
			if (is���ڱ����� != is����)
			{
				is���ڱ����� = is����;
				if (is����)
				{
					addActor(����Ҷ��Ч��);
					addActor(����Ч��);
				}
				else
				{
					����Ҷ��Ч��.remove();
					����Ч��.remove();
				}
			}
		}
		public void set����(boolean is����)
		{
			if (is���ڱ����� != is����)
			{
				is���ڱ����� = is����;
				if (is����)
				{
					addActor(����ͼ��);
				}
				else
				{
					����ͼ��.remove();
				}
			}
		}
		public void setѣ��(boolean isѣ��)
		{
			if (is���ڱ�ѣ�� != isѣ��)
			{
				is���ڱ�ѣ�� = isѣ��;
				if (isѣ��)
				{
					addActor(ѣ��ͼ��);
				}
				else
				{
					ѣ��ͼ��.remove();
				}
			}
		}
		public void setѹ��(boolean isѹ��)
		{
			if (is���ڱ�ѹ�� != isѹ��)
			{
				is���ڱ�ѹ�� = isѹ��;
				if (isѹ��)
				{
					addActor(ѹ��ͼ��);
				}
				else
				{
					ѹ��ͼ��.remove();
				}
			}
		}
		public void set����(boolean is����)
		{
			if (is���ڱ����� != is����)
			{
				is���ڱ����� = is����;
				if (is����)
				{
					addActor(����ͼ��);
				}
				else
				{
					����ͼ��.remove();
				}
			}
		}
		public void set��ä(boolean is��ä)
		{
			if (is���ڱ���ä != is��ä)
			{
				is���ڱ���ä = is��ä;
				if (is��ä)
				{
					addActor(��äͼ��);
				}
				else
				{
					��äͼ��.remove();
				}
			}
		}
		public void set����(boolean is����)
		{
			if (is���ڱ����� != is����)
			{
				is���ڱ����� = is����;
				if (is����)
				{
					addActor(����Ч��);
				}
				else
				{
					����Ч��.remove();
				}
			}
		}
	}
	private ����Ӧ��̨�� ��̨;
	private Skin Ƥ����Դ;
	private Label �غ�����ǩ;
	// �洢��ս�Ķ�������
	private Queue<������> �������� = new LinkedList<������>();
	private Queue<������> �ӳ���Ӷ������� = new LinkedList<������>();
	private Ӣ��������[] �ҷ������������� = new Ӣ��������[5];
	private Ӣ��������[] �з������������� = new Ӣ��������[5];
	private boolean is�����Ѿ���ʼ;
	private Image ս������;
	private Music ��ս��������;
	private Queue<������> �������;
	/**
	 * @param ������� �������ɶ������е��������
	 */
	public ��ս��Ļ��(Queue<������> �������)
	{
		this.������� = �������;
	}
	/**
	 * ������������������תΪ����
	 */
	private void ����ת��Ϊ����()
	{
		����˫�������ϳ�����();
		while (!�������.isEmpty())
		{
			�������.poll().���ɲ���Ӷ���(this);
		}
	}
	public Skin getƤ����Դ()
	{
		return Ƥ����Դ;
	}
	/**
	 * �÷�������������Ӣ�۵�ͼ��
	 * @param λ�� 0-4
	 */
	public void ��֪ͨӢ������(boolean is�ҷ�, int λ��)
	{
		Drawable ����ͼ = Ƥ����Դ.getDrawable("Dead");
		if (is�ҷ�)
		{
			�ҷ�������������[λ��].����Ӣ������ͼƬ(����ͼ);
		}
		else
		{
			�з�������������[λ��].����Ӣ������ͼƬ(����ͼ);
			
		}
	}
	/**
	 * @param Ӣ������λ�� 1-5
	 */
	public Ӣ�������� getӢ������(boolean is�ҷ�, int Ӣ������λ��)
	{
		return is�ҷ� ? �ҷ�������������[Ӣ������λ��-1] : �з�������������[Ӣ������λ��-1];
	}
	/**
	 * ��������ӵ��ӳ���Ӷ����У��ö�����������һ����Ӷ���������ʱ��ӵ��Ǹ������ĺ���
	 */
	public void �ӳ���Ӷ���(������ ����)
	{
		�ӳ���Ӷ�������.add(����);
	}
	public void ��Ӷ���(������ ����)
	{
		��������.add(����);
		if (!�ӳ���Ӷ�������.isEmpty())
		{
			��������.addAll(�ӳ���Ӷ�������);
			�ӳ���Ӷ�������.clear();
		}
	}
	public void �����Ա(Actor ��Ա)
	{
		��̨.addActor(��Ա);
	}
	public static class Ӣ���ͷż��ܺ�ҡ������ extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		public Ӣ���ͷż��ܺ�ҡ������(boolean is�ҷ�, int Ӣ������λ��)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
		}
		@Override
		protected ������ ���ɶ���()
		{
			Ӣ�������� Ӣ������ = ��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��);
			return new Ӣ���ͷż��ܺ�ҡ������(Ӣ������, Ӣ������.get����Z���());
		}
	}
	private static class Ӣ���ͷż��ܺ�ҡ������ extends ������
	{
		private ��������X��С���Ա仯Action ��СAction;
		private Ӣ�������� Ӣ������;
		private int Z���;
		private Ӣ���ͷż��ܺ�ҡ������(Ӣ�������� Ӣ������, int Z���)
		{
			this.Ӣ������ = Ӣ������;
			this.Z��� = Z���;
			��СAction = new ��������X��С���Ա仯Action(Ӣ������.������, Ӣ������.������, 0.2f);
		}
		@Override
		public boolean is���()
		{
			if (��СAction.isAction�ѽ���())
			{
				Ӣ������.setZIndex(Z���);
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.addAction(��СAction);
		}
	}
	public static class Ӣ���ͷż���ǰҡ������ extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private String Ӣ��Ƥ���ļ���;
		private String �����ļ���׺;
		private String ������;
		public Ӣ���ͷż���ǰҡ������(boolean is�ҷ�, int Ӣ������λ��, String Ӣ��Ƥ���ļ���, String �����ļ���׺, String ������)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.�����ļ���׺ = �����ļ���׺;
			this.������ = ������;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new Ӣ���ͷż���ǰҡ������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), Ӣ����.get����ͼ��(Ӣ��Ƥ���ļ���, �����ļ���׺), ������);
		}
	}
	private static class Ӣ���ͷż���ǰҡ������ extends ������
	{
		private Group ������ʾ = new Group();
		private Image ����;
		private Image ͼ��;
		private Label ��ǩ;
		private �ӳ�Action ������ʾ�ӳ�Action = new �ӳ�Action(1);
		private Ӣ�������� Ӣ������;
		private ��������X��С���Ա仯Action ���Action;
		private boolean is�Ѿ����;
		private Music ��Ч;
		private Ӣ���ͷż���ǰҡ������(Ӣ�������� Ӣ������, TextureRegion ����ͼ��, String ������)
		{
			this.Ӣ������ = Ӣ������;
			���� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("SmallSkillBackground"));
			ͼ�������.������Ա��������ָ������(����, 60 * 6 + 20);
			ͼ�� = new Image(����ͼ��);
			ͼ��.setSize(60, 60);
			ͼ��.setPosition(40, 0);
			��ǩ = new Label(������, ����.ʵ��.getUIƤ����Դ());
			float �������ű��� = 0.9f;
			��ǩ.setFontScale(�������ű���);
			��ǩ.setSize(��ǩ.getWidth() * �������ű���, ��ǩ.getHeight() * �������ű���);
			��ǩ.setPosition(ͼ��.getX() + ͼ��.getWidth() + 10, 20);
			������ʾ.addActor(����);
			������ʾ.addActor(ͼ��);
			������ʾ.addActor(��ǩ);
			���Action = new ��������X��С���Ա仯Action(Ӣ������.getWidth() * �ż���ǰ�����, Ӣ������.getHeight() * �ż���ǰ�����, 0.3f);
			����ƶ�Action ������ʾ����Action = new ����ƶ�Action(0, ����.getHeight(), 0.2f);
			SequenceAction ����Action = Actions.sequence(������ʾ����Action, ������ʾ�ӳ�Action);
			������ʾ.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SkillBefore.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (!is�Ѿ���� && ���Action.isAction�ѽ���())
			{
				��ս��Ļ��.ʵ��.�����Ա(������ʾ);
				������ʾ.setPosition(Ӣ������.getX() + Ӣ������.getWidth() / 2 - ����.getWidth() / 2, Ӣ������.getHeight() + Ӣ������.getY() - ����.getHeight());
				is�Ѿ���� = true;
				return false;
			}
			else if (������ʾ�ӳ�Action.isAction�ѽ���())
			{
				������ʾ.remove();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.setZIndex(Integer.MAX_VALUE);
			Ӣ������.addAction(���Action);
			��Ч.play();
		}
	}
	public static class Ӣ���ͷŴ���ǰҡ������ extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private String Ӣ��Ƥ���ļ���;
		private String ������;
		public Ӣ���ͷŴ���ǰҡ������(boolean is�ҷ�, int Ӣ������λ��, String Ӣ��Ƥ���ļ���, String ������)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.������ = ������;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new Ӣ���ͷŴ���ǰҡ������(��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��), Ӣ����.getӢ��ͼ��(Ӣ��Ƥ���ļ���), ������);
		}
	}
	private static class Ӣ���ͷŴ���ǰҡ������ extends ������
	{
		private Ӣ�������� Ӣ������;
		private ��������X��С���Ա仯Action ���Action;
		private boolean is�Ѿ����;
		private Image Ӣ��ͼ��;
		private Image ���б���;
		private Label ��ǩ;
		private �ӳ�Action �ӳ�;
		private Music ��Ч;
		private Ӣ���ͷŴ���ǰҡ������(Ӣ�������� Ӣ������, TextureRegion ͼ��, String ��������)
		{
			this.Ӣ������ = Ӣ������;
			Ӣ��ͼ�� = new Image(ͼ��);
			ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, Ӣ��ͼƬ���߶� * 1.2f);
			Ӣ��ͼ��.setPosition(-Ӣ��ͼ��.getWidth(), (������.��Ļ�� - Ӣ��ͼ��.getHeight()) / 2);
			����ƶ�Action Ӣ�۳���Action = new ����ƶ�Action(Ӣ��ͼ��.getWidth(), 0, 0.5f);
			�ӳ� = new �ӳ�Action(1);
			SequenceAction ˳��Action = Actions.sequence(Ӣ�۳���Action, �ӳ�);
			Ӣ��ͼ��.addAction(˳��Action);
			���б��� = new Image(��ս��Ļ��.ʵ��.Ƥ����Դ.getRegion("BigSkillBackground"));
			ͼ�������.������Ա��������ָ������(���б���, ������.��Ļ��);
			���б���.setY((������.��Ļ�� - ���б���.getHeight()) / 2);
			��ǩ = new Label(��������, ����.ʵ��.getUIƤ����Դ());
			float �������ű��� = 1.6f;
			��ǩ.setFontScale(�������ű���);
			��ǩ.setSize(��ǩ.getWidth() * �������ű���, ��ǩ.getHeight() * �������ű���);
			��ǩ.setPosition((������.��Ļ�� - Ӣ��ͼ��.getWidth() - ��ǩ.getWidth()) / 2 + Ӣ��ͼ��.getWidth(), (������.��Ļ�� - ��ǩ.getHeight()) / 2);
			���Action = new ��������X��С���Ա仯Action(Ӣ������.getWidth() * �ż���ǰ�����, Ӣ������.getHeight() * �ż���ǰ�����, 0.3f);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SkillBefore.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (!is�Ѿ���� && ���Action.isAction�ѽ���())
			{
				��ս��Ļ��.ʵ��.ս������.setColor(Color.GRAY);
				��ս��Ļ��.ʵ��.�����Ա(���б���);
				��ս��Ļ��.ʵ��.�����Ա(��ǩ);
				��ս��Ļ��.ʵ��.�����Ա(Ӣ��ͼ��);
				is�Ѿ���� = true;
				return false;
			}
			else if (�ӳ�.isAction�ѽ���())
			{
				��ս��Ļ��.ʵ��.ս������.setColor(Color.WHITE);
				���б���.remove();
				��ǩ.remove();
				Ӣ��ͼ��.remove();
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.setZIndex(Integer.MAX_VALUE);
			Ӣ������.addAction(���Action);
			��Ч.play();
		}
	}
	@Override
	public void render(float delta)
	{
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		if (!��������.isEmpty())
		{
			������ ���� = ��������.peek();
			if (!is�����Ѿ���ʼ)
			{
				����.��ʼ();
				is�����Ѿ���ʼ = true;
			}
			else if (����.is���())
			{
				��������.poll();
				is�����Ѿ���ʼ = false;
			}
		}
		else if (!�ӳ���Ӷ�������.isEmpty())
		{
			��������.addAll(�ӳ���Ӷ�������);
			�ӳ���Ӷ�������.clear();
		}
		��̨.act();
		��̨.draw();
	}
	@Override
	public void show()
	{
		if (��̨ == null)
		{
			ʵ�� = this;
			��̨ = new ����Ӧ��̨��();
			��̨.addListener(new ClickListener()
			{
				@Override
				public void clicked(InputEvent event, float x, float y)
				{
					if (��������.isEmpty())
					{
						��ս��������.stop();
						��ս��������.dispose();
						����.ʵ��.���ű�������();
						����.ʵ��.�˳���Ļ();
					}
				}
			});
			// ��������ͼ��
			TextureAtlas ����ͼ�� = new TextureAtlas(Gdx.files.internal(ͼƬ����ļ���));
			// ����Ƥ����Դ
			Ƥ����Դ = new Skin(����ͼ��);
			// ����
			ս������ = new Image(Ƥ����Դ.getRegion("Background"));
			ս������.setSize(������.��Ļ��, ������.��Ļ��);
			��̨.addActor(ս������);
			// �غ�����ǩ
			�غ�����ǩ = new Label(null, new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), Color.WHITE));
			��̨.addActor(�غ�����ǩ);
			// �з�����ͼƬ����
			Ӣ����[] �з�Ӣ������ = ������Ϣ��.get����().getӢ������();
			// �ҷ�����ͼƬ����
			Ӣ����[] �ҷ�Ӣ������ = �����Ϣ��.get����().getӢ������();
			for (int i = 0; i < �ҷ�Ӣ������.length; i++)
			{
				if (�ҷ�Ӣ������[i] != null)
				{
					Image Ӣ��ͼ�� = new Image(Ӣ����.getӢ��ͼ��(�ҷ�Ӣ������[i].getӢ��Ƥ���ļ���()));
					ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, Ӣ��ͼƬ���߶�);
					ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, Ӣ��ͼƬ�����);
					Ӣ��ͼ��.setOrigin(Ӣ��ͼ��.getWidth() / 2, Ӣ��ͼ��.getHeight() / 2);
					�ҷ�������������[i] = new Ӣ��������(�ҷ�X��������[i], Ӣ��ͼ��, Ƥ����Դ.getRegion("LifeBarFore"), Ƥ����Դ.getRegion("LifeBarBack"));
				}
				if (�з�Ӣ������[i] != null)
				{
					Image Ӣ��ͼ�� = new Image(Ӣ����.getӢ��ͼ��(�з�Ӣ������[i].getӢ��Ƥ���ļ���()));
					ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, Ӣ��ͼƬ���߶�);
					ͼ�������.������Ա��������ָ������(Ӣ��ͼ��, Ӣ��ͼƬ�����);
					Ӣ��ͼ��.setOrigin(Ӣ��ͼ��.getWidth() / 2, Ӣ��ͼ��.getHeight() / 2);
					�з�������������[i] = new Ӣ��������(�з�X��������[i], Ӣ��ͼ��, Ƥ����Դ.getRegion("LifeBarFore"), Ƥ����Դ.getRegion("LifeBarBack"));
				}
			}
			����ת��Ϊ����();
			��ս�������� = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "BattleBackground.mp3"));
			��ս��������.setLooping(true);
			��ս��������.setVolume(0.15f);
			����.ʵ��.ֹͣ���ű�������();
			��ս��������.play();
		}
		// �����û�����
		Gdx.input.setInputProcessor(��̨);
	}
	public void ���ûغ���(int �غ���)
	{
		String �غ��ı� = String.valueOf(�غ���);
		�غ�����ǩ.setText(�غ��ı�);
		TextBounds �ı����ο� = ����.ʵ��.getUIƤ����Դ().getFont("default").getBounds(�غ��ı�);
		�غ�����ǩ.setWidth(�ı����ο�.width);
		�غ�����ǩ.setHeight(�ı����ο�.height);
		�غ�����ǩ.setPosition(�غ�����ǩX���� - �غ�����ǩ.getWidth() / 2, �غ�����ǩY���� - �غ�����ǩ.getHeight() / 2);
	}
	private class �ҷ��ϳ������� extends ������
	{
		private static final float �ƶ�ʱ�� = 0.5f;
		private static final int �������� = 10;
		private static final int ��������λ�� = 10;
		private ParallelAction �ƶ�������Action;
		private �����ƶ�Action �ƶ�Action;
		private Ӣ�������� Ӣ������;
		private �ҷ��ϳ�������(Ӣ�������� Ӣ������, float Ŀ��X, float Ŀ��Y)
		{
			this.Ӣ������ = Ӣ������;
			MoveByAction �������� = Actions.moveBy(0, ��������λ��, �ƶ�ʱ�� / �������� / 2);
			MoveByAction �������� = Actions.moveBy(0, -��������λ��, �ƶ�ʱ�� / �������� / 2);
			SequenceAction �������� = Actions.sequence(��������, ��������);
			RepeatAction ����������� = Actions.repeat(��������, ��������);
			�ƶ�Action = new �����ƶ�Action(Ŀ��X, Ŀ��Y, �ƶ�ʱ��);
			�ƶ�������Action = Actions.parallel(�ƶ�Action, �����������);
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				Ӣ������.removeAction(�ƶ�������Action);
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ������.addAction(�ƶ�������Action);
		}
	}
	private class �з��ϳ������� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private Ӣ�������� Ӣ��ͼƬ;
		private �з��ϳ�������(Ӣ�������� Ӣ��ͼƬ, float Ŀ��X, float Ŀ��Y)
		{
			this.Ӣ��ͼƬ = Ӣ��ͼƬ;
			�ƶ�Action = new �����ƶ�Action(Ŀ��X, Ŀ��Y, 0.3f);
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		@Override
		public void ��ʼ()
		{
			Ӣ��ͼƬ.addAction(�ƶ�Action);
		}
	}
	private void ����˫�������ϳ�����()
	{
		for (int i = 4; i >= 0; i--)
		{
			if (�з�������������[i] != null)
			{
				�з�������������[i].setPosition(������.�������ֵ(������.��Ļ��), ������.��Ļ��);
				��������.add(new �з��ϳ�������(�з�������������[i], �з�������������[i].getĿ��X��Ӧλ��X(�з�X��������[i]), �з�������������[i].getĿ��Y��Ӧλ��Y(�з�Y��������[i])));
				��̨.addActor(�з�������������[i]);
				�з�������������[i].��������Z���();
			}
		}
		���ж����� �ҷ������ϳ����� = new ���ж�����();
		for (int i = 0; i < 5; i++)
		{
			if (�ҷ�������������[i] != null)
			{
				�ҷ�������������[i].setPosition(�ҷ�������������[i].getĿ��X��Ӧλ��X(�ҷ�X��������[i]), -�ҷ�������������[i].getHeight());
				�ҷ������ϳ�����.��Ӷ���(new �ҷ��ϳ�������(�ҷ�������������[i], �ҷ�������������[i].getĿ��X��Ӧλ��X(�ҷ�X��������[i]), �ҷ�������������[i].getĿ��Y��Ӧλ��Y(�ҷ�Y��������[i])));
				��̨.addActor(�ҷ�������������[i]);
				�ҷ�������������[i].��������Z���();
			}
		}
		��������.add(�ҷ������ϳ�����);
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
