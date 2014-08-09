package edu.bjfu.lol.Ӣ��.����֮��;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.math.Vector2;

import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
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

class Ⱥ��׹�似���� extends ������ {
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 1;
	private static final int ���ܻ����˺� = 60;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.4f;
	private static final int ÿ��Ч������ħ������ֵ = 8;
	private static final int ħ�����Խ��ͳ����غ��� = 2;
	private static final int ħ�����Խ��Ϳɵ��Ӳ��� = 10;
	private static final String ������ = "Ⱥ��׹��";
	private static final String �������� = String.format("%s  �������ٻ�������,�Ե���ǰ�����%d(+%.1f����ǿ��)ħ����\n������������%d��ħ������,����%d�غ�,��Ч�������Ե���%d��.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ÿ��Ч������ħ������ֵ, ħ�����Խ��ͳ����غ���, ħ�����Խ��Ϳɵ��Ӳ���);
	private static class ħ�����Խ���״̬�� extends ״̬��
	{
		public ħ�����Խ���״̬��() {
			super(ħ�����Խ��ͳ����غ���, ħ�����Խ��Ϳɵ��Ӳ���, 1);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.���ħ��������ֵ�仯(super.get��ǰ����() * -ÿ��Ч������ħ������ֵ);
		}
		@Override
		public String get״̬����() {
			return String.format("Ⱥ��׹�䣬ħ�����Խ��ͣ�����%d", super.get��ǰ����());
		}
	}
	public Ⱥ��׹�似����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private static class �ͷ������� extends ������
	{
		private String Ӣ��Ƥ���ļ���;
		private LinkedList<Vector2> λ������ = new LinkedList<Vector2>();
		public �ͷ�������(String Ӣ��Ƥ���ļ���, LinkedList<��ս��Ӣ����> ������Ӣ������)
		{
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			for (��ս��Ӣ���� Ӣ�� : ������Ӣ������)
			{
				if (Ӣ��.is�ҷ�())
				{
					λ������.add(new Vector2(��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
				else
				{
					λ������.add(new Vector2(��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
			}
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(λ������, Ӣ��Ƥ���ļ���);
		}
	}
	private static class �ͷŶ����� extends ������
	{
		private static final int λ�� = 300;
		private ������Ա��[] ��������;
		private ����ƶ�Action[] �ƶ�Action����;
		private Music ��Ч;
		private �ͷŶ�����(LinkedList<Vector2> λ������, String Ӣ��Ƥ���ļ���)
		{
			�������� = new ������Ա��[λ������.size()];
			�ƶ�Action���� = new ����ƶ�Action[��������.length];
			for (int i = 0; i < λ������.size(); i++)
			{
				ParticleEffect ����Ч�� = new ParticleEffect();
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				��������[i] = new ������Ա��(����Ч��);
				�ƶ�Action����[i] = new ����ƶ�Action(0, -λ��, 0.5f);
				��������[i].addAction(�ƶ�Action����[i]);
				Vector2 λ�� = λ������.get(i);
				��������[i].setPosition(λ��.x, λ��.y + λ��);
			}
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillQ.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action����[0].isAction�ѽ���())
			{
				for (������Ա�� ���� : ��������)
				{
					����.remove();
				}
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
			��Ч.play();
			for (������Ա�� ���� : ��������)
			{
				��ս��Ļ��.ʵ��.�����Ա(����);
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		int ������˺� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		LinkedList<��ս��Ӣ����> ������Ӣ������ = new LinkedList<��ս��Ӣ����>();
		���������� �������� = new ����������();
		for (��ս��Ӣ���� ������Ӣ�� : �з�����.getǰ�ű�����Ӣ������())
		{
			if (������Ӣ�� != null && !������Ӣ��.is����() && !������Ӣ��.is��ս������())
			{
				״̬�� ״̬ = ������Ӣ��.getħ�����Լ���״̬(ħ�����Խ���״̬��.class);
				��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "ħ����", false));
				������Ӣ������.add(������Ӣ��);
				if (״̬ == null)
				{
					������Ӣ��.���ħ�����Լ���״̬(new ħ�����Խ���״̬��());
				}
				else
				{
					״̬.����״̬�غ���();
					״̬.����һ��(false);
				}
				������˺� += ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int)(�ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ��� + ���ܻ����˺�), ��ֵ��͸, �ٷֱȴ�͸, ��������);
			}
		}
		��������.�������(new �ͷ�������(�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), ������Ӣ������));
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.������Ѫ(������˺�, true);
		return true;
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "B";
	}
}
