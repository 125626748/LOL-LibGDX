package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ��������;
import edu.bjfu.lol.��̬.Ӣ����;

public class ��������Ӣ���� extends Ӣ����
{
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��������Ӣ����()
	{
		// ���ü���
		��������[0] = new ȫ���ע������();
		��������[1] = new ��˪���������();
		��������[2] = new ����뷢������();
		��������[3] = new ӥ�����ռ�����();
		��������[4] = new ħ��ˮ����������();
		// ����Ӣ������
		Ӣ������.set������(49);
		Ӣ������.set�����ٶ�(0.658f);
		Ӣ������.set����ֵ(325);
		Ӣ������.set����ֵ(15);
		Ӣ������.setħ������(30);
		Ӣ������.set�������ֵ(474);
		Ӣ������.set�����ظ�(5);
	}
	@Override
	public Ӣ�������� getӢ������()
	{
		return Ӣ������;
	}
	@Override
	public ������[] get��������()
	{
		return ��������;
	}
	@Override
	public String getӢ������()
	{
		return "��������";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Ashe";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return false;
	}
	private class �չ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �չ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �չ������� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �չ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AsheAttack.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			����Ч��.findEmitter("Untitled").getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�ƶ�Action = new �����ƶ�Action(������x, ������y, 0.5f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AsheAttack.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				����.remove();
				����.dispose();
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
			��ս��Ļ��.ʵ��.�����Ա(����);
			��Ч.play();
		}
	}
	@Override
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
	}
}
