package edu.bjfu.lol.Ӣ��.а��С��ʦ;

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

public class а��С��ʦӢ���� extends Ӣ���� {

	private ������[] �������� = new ������[4];
	private Ӣ�������� Ӣ������ = new Ӣ��������();
	public а��С��ʦӢ����() {
		��������[0] = new �ڰ����뼼����();
		��������[1] = new �ڰ����ʼ�����();
		��������[2] = new Ť���ռ似����();
		��������[3] = new �������Ѽ�����();
		Ӣ������.set�������ֵ(355);
		Ӣ������.set����ֵ(340);
		Ӣ������.set�����ٶ�(0.625f);
		Ӣ������.set������(48);
		Ӣ������.set�����ظ�(4);
		Ӣ������.set����ֵ(12);
		Ӣ������.setħ������(30);
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
		return "а��С��ʦ";
	}
	@Override
	public String getӢ��Ƥ���ļ���()
	{
		return "Veigar";
	}
	@Override
	public boolean is��ս(��ս��Ӣ���� ��ս��Ӣ��)
	{
		return false;
	}
	@Override
	public ������ get��ͨ��������(int ������x, int ������y, int ������x, int ������y, boolean is�����ι���, String Ӣ��Ƥ���ļ���, ��ս��Ӣ���� ��ս��Ӣ��)
	{
		return new ��ͨ����������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
	}
	private class ��ͨ���������� extends ������
	{
		private int ������X;
		private int ������Y;
		private int ������X;
		private int ������Y;
		private String Ӣ��Ƥ���ļ���;
		public ��ͨ����������(int ������x, int ������y, int ������x, int ������y, String Ӣ��Ƥ���ļ���)
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
			return new ��ͨ����������(������X, ������Y, ������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ��ͨ���������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ����;
		private Music ��Ч;
		private ��ͨ����������(int ������X, int ������Y, int ������X, int ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "VeigarAttack.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.45f);
			SequenceAction ����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "VeigarAttack.mp3"));
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
