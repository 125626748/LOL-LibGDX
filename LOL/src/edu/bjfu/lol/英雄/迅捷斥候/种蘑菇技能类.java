package edu.bjfu.lol.Ӣ��.Ѹ�ݳ��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��Ģ�������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 7;
	private static final int �����˺� = 200;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.8f;
	private static final float ����ֵ���ٰٷֱ� = 30f / 100;
	private static final int ����ֵ���ٳ����غ��� = 2;
	private static final float ������ = 50f / 100;
	private static final String ������ = "��Ģ��";
	private static final String �������� = String.format("%s  ʹ��һ�������Ģ������������,�����Ŀ�괦����,��ɢ����\n�����ĵ���,���%d(+%.1f����ǿ��)ħ���˺�,����%.0f%%����ֵ,����%d��\n��,������%.0f%%.", 
			������,
			�����˺�, �����˺���ռ����ǿ�ȱ���, ����ֵ���ٰٷֱ� * 100, ����ֵ���ٳ����غ���, ������ * 100);
	private static class ����ֵ����״̬�� extends ״̬��
	{

		public ����ֵ����״̬��() {
			super(����ֵ���ٳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-����ֵ���ٰٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "��Ģ��������ֵ����";
		}
	}
	public ��Ģ��������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action Ģ���ӳ� = new �ӳ�Action(1f);
		private boolean isĢ���Ƴ�;
		private �ӳ�Action ��ը�ӳ� = new �ӳ�Action(0.6f);
		private ������Ա�� ��ը����;
		private ������Ա�� Ģ������;
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			// Ģ��
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TeemoSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			Ģ������ = new ������Ա��(����Ч��);
			Ģ������.setPosition(������x, ������y);
			Ģ������.addAction(Ģ���ӳ�);
			// ��ը
			����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "TeemoSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			��ը���� = new ������Ա��(����Ч��);
			��ը����.setPosition(������x, ������y);
			��ը����.addAction(��ը�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "TeemoSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (Ģ���ӳ�.isAction�ѽ���())
			{
				if (!isĢ���Ƴ�)
				{
					Ģ������.remove();
					Ģ������.dispose();
					��ս��Ļ��.ʵ��.�����Ա(��ը����);
					isĢ���Ƴ� = true;
					return false;
				}
				else if (��ը�ӳ�.isAction�ѽ���())
				{
					��ը����.remove();
					��ը����.dispose();
					return true;
				}
			}
			return false;
		}
		@Override
		public void ��ʼ()
		{
			��ս��Ļ��.ʵ��.�����Ա(Ģ������);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		int ���˺� = 0;
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		���������� �������� = new ����������();
		for (��ս��Ӣ���� ���� : �з�����.get���������С��ΧӢ������())
		{
			if (���� != null && !����.is����())
			{
				����������++;
				if (����.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[����.getӢ������λ��()-1];
				}
				if (������.����_����_�����Ƿ���(������))
				{
					��������.�������(new ״̬�ı���ʾ������(����.is�ҷ�(), ����.getӢ������λ��(), "���֡�", false));
					����.�������ֵ����״̬(new ����ֵ����״̬��());
					���˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		������x /= ����������;
		������y /= ����������;
		������װ����.ʵ��.�������(new �ͷ�������(������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���˺�, true);
		}
		return true;
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public String get������() {
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
