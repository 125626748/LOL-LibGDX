package edu.bjfu.lol.Ӣ��.��β����;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

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

public class ��β����Ӣ���� extends Ӣ���� {

	private ������[] �������� = new ������[5];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public ��β����Ӣ����() {
		��������[0] = new �����Ǽ�����();
		��������[1] = new ��թ���鼼����(); 
		��������[2] = new �����������();
		��������[3] = new �Ȼ�����������();
		��������[4] = new ���ͻϮ������();
		Ӣ������.set�������ֵ(380);
		Ӣ������.set����ֵ(11);
		Ӣ������.set����ֵ(330);
		Ӣ������.set������(50);
		Ӣ������.set�����ظ�(5);
		Ӣ������.setħ������(30);
		Ӣ������.set�����ٶ�(0.64f);
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
		return "��β����";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Ahri";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return false;
	}
	@Override
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new �չ�������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
	}
	private class �չ������� extends ������
	{
		private int ������X;
		private int ������Y;
		private int ������X;
		private int ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �չ�������(int ������x, int ������y, int ������x, int ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��β������ͨ����������(������X, ������Y, ������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ��β������ͨ���������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ����;
		private Music ��Ч;
		private ��β������ͨ����������(int ������X, int ������Y, int ������X, int ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AhriAttack.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.45f);
			SequenceAction ����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AhriAttack.mp3"));
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
}