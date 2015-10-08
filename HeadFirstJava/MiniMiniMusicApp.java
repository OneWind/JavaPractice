import javax.sound.midi.*;

public class MiniMiniMusicApp {
	
	public static void main(String[] args) {
		
		MiniMiniMusicApp mini = new MiniMiniMusicApp();
		mini.play();
		
	}
	
	public void play() {
		
		try {
			
			Sequencer player = MidiSystem.getSequencer();
			player.open();
			
			Sequence seq = new Sequence(Sequence.PPQ, 4);
			
			Track track = seq.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144, 1, 44, 100);
			MidiEvent noteOn = new MidiEvent(a, 1);
			track.add(noteOn);

						
			ShortMessage b = new ShortMessage();
			b.setMessage(128, 1, 44, 100);
			MidiEvent noteOff = new MidiEvent(b, 3);
			track.add(noteOff);

			ShortMessage a2 = new ShortMessage();
			a2.setMessage(144, 1, 45, 100);
			MidiEvent noteOn2 = new MidiEvent(a2, 4);
			track.add(noteOn2);

						
			ShortMessage b2 = new ShortMessage();
			b2.setMessage(128, 1, 45, 100);
			MidiEvent noteOff2 = new MidiEvent(b2, 10);
			track.add(noteOff2);
			
			player.setSequence(seq);
			
			player.start();
//			player.stop();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
