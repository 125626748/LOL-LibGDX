package edu.bjfu.lol.Ӣ��.Ƥ��Ů��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class _90�ھ����������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 9;
	private static final int ���ܻ����˺� = 80;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.8f;
	private static final float ����ֵ���ٰٷֱ� = 50f / 100;
	private static final int ����ֵ���ͳ����غ��� = 1;
	private static final String ������ = "90�ھ�����";
	private static final String �������� = String.format("%s  �����ճ�Ŀ��ų�һ����,���%d(+%.0f����ǿ��)ħ���˺�,\n�����ٱ����еĵз�Ŀ��%.0f%%������ֵ,����%d�غ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ����ֵ���ٰٷֱ� * 100, ����ֵ���ͳ����غ���);
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��() {
			super(����ֵ���ͳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-����ֵ���ٰٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "90�ھ�����������ֵ����";
		}
	}
	public _90�ھ�����������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
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
			return new �ͷŶ�����(������X, ������Y, ������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч; 
		public �ͷŶ�����(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.55f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillE.mp3"));
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ������Ӣ�� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
		if (������Ӣ�� != null)
		{
			���������� �������� = new ����������();
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "����ֵ��", false));
			������Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
			int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
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
		return "D";
	}
}
