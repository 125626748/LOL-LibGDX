package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
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

public class ��������Ӣ���� extends Ӣ���� {
	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��������Ӣ����() {
		��������[0] = new ����м�����();
		��������[1] = new ǹ�ڽ�����������();
		��������[2] = new �𵴵�Ų�������();
		��������[3] = new ���������׼�����();
		��������[4] = new ����������ɵ�������();
		Ӣ������.set�������ֵ(420);
		Ӣ������.set����ֵ(14);
		Ӣ������.set����ֵ(325);
		Ӣ������.set������(50);
		Ӣ������.set�����ظ�(5);
		Ӣ������.setħ������(30);
		Ӣ������.set�����ٶ�(0.65f);
	}
	@Override
	public Ӣ�������� getӢ������() {
		return Ӣ������;
	}
	@Override
	public ������[] get��������() {
		return ��������;
	}
	@Override
	public String getӢ������() {
		return "��������";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Jinx";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return false;
	}
	private class �չ������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.1f);
		private ������Ա�� ����;
		private Music ��Ч;
		public �չ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			����Ч��.findEmitter("Untitled").getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������x, ������y, 0.3f);
			����.addAction(Actions.sequence(�ƶ�Action, �ӳ�));
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "JinxAttack.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
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
	private class �չ������� extends ������
	{
		private int ������x;
		private int ������y;
		private int ������x;
		private int ������y;
		private String Ӣ��Ƥ���ļ���;
		public �չ�������(int ������x, int ������y, int ������x, int ������y, String Ӣ��Ƥ���ļ���)
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
	@Override
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
	}
}
