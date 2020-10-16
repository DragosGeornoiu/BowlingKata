/**
 *  Copyright Murex S.A.S., 2003-2020. All Rights Reserved.
 * 
 *  This software program is proprietary and confidential to Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights, shall not be accessed, used, reproduced or distributed without the
 *  express prior written consent of Murex and subject to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly prohibited.
 */
import org.junit.Assert;
import org.junit.Test;


/**
 * Copyright Murex S.A.S., 2003-2020. All Rights Reserved. This software program is proprietary and confidential to
 * Murex S.A.S and its affiliates ("Murex") and, without limiting the generality of the foregoing reservation of rights,
 * shall not be accessed, used, reproduced or distributed without the express prior written consent of Murex and subject
 * to the applicable Murex licensing terms. Any modification or removal of this copyright notice is expressly
 * prohibited.
 */
public class BowlingGameTest {

    //~ ----------------------------------------------------------------------------------------------------------------
    //~ Methods 
    //~ ----------------------------------------------------------------------------------------------------------------

    @Test
    public void test1() {
        BowlingGame game = new BowlingGame();
        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }
        Assert.assertEquals(0, game.score());
    }
}
